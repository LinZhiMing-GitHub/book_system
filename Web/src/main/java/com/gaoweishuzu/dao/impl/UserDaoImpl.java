package com.gaoweishuzu.dao.impl;

import com.gaoweishuzu.dao.UserDao;
import com.gaoweishuzu.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void insert(User user) {

    }

    @Override
    public User findByEmail(String email) {
        return null;
    }
}
