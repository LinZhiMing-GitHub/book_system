package com.gaoweishuzu.service;

import com.gaoweishuzu.domain.User;

/**
 * 注册业务接口
 */
public interface LoginService {
    // 通过id查找记录
    User findByEmail(String email);
}
