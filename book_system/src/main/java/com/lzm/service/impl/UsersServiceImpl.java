package com.lzm.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lzm.domain.Users;
import com.lzm.dao.UsersDao;
import com.lzm.dto.LoginFormDTO;
import com.lzm.dto.Result;
import com.lzm.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzm.utils.RegexUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import java.util.concurrent.TimeUnit;

import static com.lzm.utils.RedisConstants.LOGIN_CODE_KEY;
import static com.lzm.utils.RedisConstants.LOGIN_CODE_TTL;
import static com.lzm.utils.SystemConstants.LOGIN_PASSWORD;
import static com.lzm.utils.SystemConstants.LOGIN_USERNAME_PREFIX;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 林志明
 * @since 2024-05-31
 */
@Slf4j
@Service
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements IUsersService {

    @Resource
    private UsersDao usersDao;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 发送验证码
     * @param loginFormDTO
     * @param session
     * @return
     */
    @Override
    public Result sendCode(LoginFormDTO loginFormDTO, HttpSession session) {
        // 检验手机号是否合法
        if (RegexUtils.isPhoneInvalid(loginFormDTO.getPhone())) {
            // 不合法
            return Result.fail("无效手机号");
        }
        // 生成验证码
        String code = RandomUtil.randomNumbers(6);
        // 将验证码保存到Redis
        stringRedisTemplate.opsForValue()
                .set(LOGIN_CODE_KEY + loginFormDTO.getPhone(), code, LOGIN_CODE_TTL, TimeUnit.MINUTES);
        // 将验证码传回前端
        return Result.ok(code);
    }

    /**
     * 密码登录
     * @param loginFormDTO
     * @param session
     * @return
     */
    @Override
    public Result login(LoginFormDTO loginFormDTO, HttpSession session) {
        // 检验手机号是否合法
        if (RegexUtils.isPhoneInvalid(loginFormDTO.getPhone())) {
            // 不合法
            return Result.fail("无效手机号");
        }
        // 按照手机号查询账号
        String phone = loginFormDTO.getPhone();
        LambdaQueryWrapper<Users> lqw = new LambdaQueryWrapper<Users>();
        lqw.eq(Users::getPhone, phone);
        Users users = usersDao.selectOne(lqw);

        // 反向校验
        if (users == null || users.getPassword().equals(loginFormDTO.getPassword())) {
            // 账号不存在 or 密码不匹配
            return Result.fail("手机号或密码错误");
        }
        // 登录成功返回账号信息
        return Result.ok(users);
    }

    /**
     * 没账号则注册，有账号则手机号&验证码登录
     * @param loginFormDTO
     * @param session
     * @return
     */
    @Override
    public Result codeLogin(LoginFormDTO loginFormDTO, HttpSession session) {
        // 检验手机号是否合法
        if (RegexUtils.isPhoneInvalid(loginFormDTO.getPhone())) {
            // 不合法
            return Result.fail("无效手机号");
        }
        // 从Redis取出验证码
        String cacheCode = stringRedisTemplate.opsForValue().get(LOGIN_CODE_KEY + loginFormDTO.getPhone());
        // 查看验证码是否匹配
        if (loginFormDTO.getCode() == null || !cacheCode.equals(loginFormDTO.getCode())) {
            // 不匹配
            return Result.fail("验证码错误");
        }
        // 按照手机号查询账号
        String phone = loginFormDTO.getPhone();
        LambdaQueryWrapper<Users> lqw = new LambdaQueryWrapper<Users>();
        lqw.eq(Users::getPhone, phone);
        Users users = usersDao.selectOne(lqw);
        // 看MySQL是否有账号
        if (users == null) {
            // 没有账号，则注册
            createUserByPhone(phone);
        }
        // 登录
        Users users1 = lambdaQuery().eq(Users::getPhone, phone).one();
        // 返回账号信息
        return Result.ok(users1);
    }

    /**
     * 注册
     * @param phone
     * @return
     */
    private Users createUserByPhone(String phone) {
        Users user = new Users();
        user.setUsername(LOGIN_USERNAME_PREFIX + RandomUtil.randomString(10));
        user.setPassword(LOGIN_PASSWORD);
        user.setPhone(phone);
        save(user);
        return user;
    }

}
