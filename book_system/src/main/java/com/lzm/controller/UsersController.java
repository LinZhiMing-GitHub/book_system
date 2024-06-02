package com.lzm.controller;

import com.lzm.dto.LoginFormDTO;
import com.lzm.dto.Result;
import com.lzm.service.IUsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 林志明
 * @since 2024-05-31
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Resource
    private IUsersService usersService;

    // 发送手机验证码
    @PostMapping("/code")
    public Result sendCode(@RequestBody LoginFormDTO loginFormDTO, HttpSession session) {
        // 发送短信验证码并保存验证码
        return usersService.sendCode(loginFormDTO, session);
    }

    // 通过手机号&密码登录
    @PostMapping("/login")
    public Result login(@RequestBody LoginFormDTO loginFormDTO, HttpSession session) {
        return usersService.login(loginFormDTO, session);
    }

    /**
     * 通过手机号&验证码登录
     * @param loginFormDTO
     * @param session
     * @return
     */
    @PostMapping("/codeLogin")
    public Result codeLogin(@RequestBody LoginFormDTO loginFormDTO, HttpSession session) {
        return usersService.codeLogin(loginFormDTO, session);
    }

}

