package com.gaoweishuzu.web;

import com.gaoweishuzu.config.SpringConfig;
import com.gaoweishuzu.domain.User;
import com.gaoweishuzu.service.LoginService;
import com.gaoweishuzu.service.impl.LoginServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录servlet类
 * 负责前后端数据传递
 */

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 创建Spring配置类对象
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 获取LoginService的bean
        LoginService loginService = ctx.getBean(LoginService.class);
        // 获取前端数据
        String email = req.getParameter("email1");
        String password = req.getParameter("password1");

        // 查看前端传来的数据
        System.out.println("LS-email:" + email);
        System.out.println("LS-password:" + password);

        // 通过邮箱查找密码
        User user = loginService.findByEmail(email);
        System.out.println("LS-user:" + user);

        // 判断是否登录成功
        if (user != null && user.getPassword().equals(password)) {
            // 登录成功
            // 跳转到主页面
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            // 登录失败，跳转到登录注册页面并且返回错误信息
            req.setAttribute("login_msg", "邮箱或密码错误");
            req.getRequestDispatcher("Login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
