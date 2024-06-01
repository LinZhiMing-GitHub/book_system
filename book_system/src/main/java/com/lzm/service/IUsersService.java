package com.lzm.service;

import com.lzm.domain.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lzm.dto.LoginFormDTO;
import com.lzm.dto.Result;
import org.apache.catalina.filters.RestCsrfPreventionFilter;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 林志明
 * @since 2024-05-31
 */
public interface IUsersService extends IService<Users> {

    /**
     * 发送验证码
     * @param loginFormDTO
     * @param session
     * @return
     */
    Result sendCode(LoginFormDTO loginFormDTO, HttpSession session);

    /**
     * 通过密码登录
     * @param loginFormDTO
     * @param session
     * @return
     */
    Result login(LoginFormDTO loginFormDTO, HttpSession session);

    /**
     * 通过验证码登录
     * @param loginFormDTO
     * @param session
     * @return
     */
    Result codeLogin(LoginFormDTO loginFormDTO, HttpSession session);
}
