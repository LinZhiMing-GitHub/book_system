package com.gaoweishuzu;

import com.gaoweishuzu.config.SpringConfig;
import com.gaoweishuzu.domain.User;
import com.gaoweishuzu.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        LoginService loginService = ctx.getBean(LoginService.class);

        User user = loginService.findByEmail("111@163.com");
        System.out.println(user);
    }
}
