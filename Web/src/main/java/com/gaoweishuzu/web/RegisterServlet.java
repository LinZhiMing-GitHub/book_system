package com.gaoweishuzu.web;

import com.gaoweishuzu.config.SpringConfig;
import com.gaoweishuzu.domain.User;
import com.gaoweishuzu.service.RegisterService;
import com.gaoweishuzu.service.impl.RegisterServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 注册servlet类
 * 负责前后端数据传递
 */

@WebServlet("/registerServlet")
//@Controller
public class RegisterServlet extends HttpServlet {
//    // 创建Spring配置类对象
//    ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//    // 获取RegisterService的bean
//    RegisterService registerService = ctx.getBean(RegisterService.class);
    RegisterService registerService = new RegisterServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取前端数据
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // 将数据保存到实体类
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        // 用于debug
        System.out.println("RS-username:"+user.getUsername());
        System.out.println("RS-email:"+user.getEmail());
        System.out.println("RS-password:"+user.getPassword());

        // 通过邮箱查找是否重名
        boolean flag = register(user);
        System.out.println("RS-flag:"+flag);

        // 判断是否注册成功
        if (flag){
            // 当flag是True，代表没有记录，即不重名，注册成功
            System.out.println("RS:注册成功");
            // 插入记录
            registerService.insert(user);
            // 跳转到主页面
            System.out.println("RS:插入完了");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        } else {
            // 注册失败，跳转到注册页面并且返回错误信息
//            req.setAttribute("register_msg", "用户名已存在");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    // 注册
    public boolean register(User user) {
        boolean flag = false;

        User user1 = registerService.findByEmail(user.getEmail());
        if (user1 == null) {
            registerService.insert(user);
            flag = true;
        }

        return flag;
    }
}