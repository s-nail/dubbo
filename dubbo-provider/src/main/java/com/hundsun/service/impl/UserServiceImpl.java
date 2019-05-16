package com.hundsun.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hundsun.dao.UserMapper;
import com.hundsun.domain.User;
import com.hundsun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int saveUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
