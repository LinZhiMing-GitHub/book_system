package com.gaoweishuzu.dao;

import com.gaoweishuzu.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 用户数据层接口
 */
public interface UserDao {
    // 插入一条记录
    @Insert("insert into tb_user(username, email, password) values(#{username}, #{email}, #{password})")
    void insert(User user);

    // 通过email查找记录
//    @Select("select * from tb_user where email = #{email}")
    @Select("select * from web.tb_user where email = #{email}")
    User findByEmail(String email);
}
