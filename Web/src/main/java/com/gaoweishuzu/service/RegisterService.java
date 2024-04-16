package com.gaoweishuzu.service;

import com.gaoweishuzu.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * 注册业务接口
 */
public interface RegisterService {
    // 插入一条记录
    void insert(User user);

    // 通过id查找记录
    User findByEmail(String email);
}
