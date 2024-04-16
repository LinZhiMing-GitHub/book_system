package com.gaoweishuzu.service.impl;

import com.gaoweishuzu.dao.UserDao;
import com.gaoweishuzu.domain.User;
import com.gaoweishuzu.service.LoginService;
import com.gaoweishuzu.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录业务接口实现类
 */
// 为该业务层类创建bean对象
@Service
public class LoginServiceImpl implements LoginService {
    // 按类型自动装配DAO对象
    @Autowired
    private UserDao userDao;

    public User findByEmail(String email) {
        System.out.println("LSI:"+email);
        User user = userDao.findByEmail(email);
        System.out.println("LSI:"+user);
        return user;
    }
}
