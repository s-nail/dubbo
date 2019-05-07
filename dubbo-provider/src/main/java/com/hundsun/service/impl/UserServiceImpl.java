package com.hundsun.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hundsun.domain.User;
import com.hundsun.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public User saveUser(User user) {
        user.setId(1);
        System.out.println(user.toString());
        return user;
    }
}
