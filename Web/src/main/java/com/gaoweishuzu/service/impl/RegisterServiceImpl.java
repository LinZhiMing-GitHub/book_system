package com.gaoweishuzu.service.impl;

import com.gaoweishuzu.config.SpringConfig;
import com.gaoweishuzu.dao.UserDao;
import com.gaoweishuzu.domain.User;
import com.gaoweishuzu.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 注册业务接口实现类
 */
// 为该业务层类创建bean对象
@Service
public class RegisterServiceImpl implements RegisterService {
    // 按类型自动装配DAO对象
    @Autowired
    private UserDao userDao;

    public void insert(User user) {
        userDao.insert(user);
    }

    public User findByEmail(String email) {
        System.out.println("RSI:"+email);
        return userDao.findByEmail(email);
    }
}
