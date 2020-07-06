package com.hundsun.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hundsun.domain.User;
import com.hundsun.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {


    @Override
    public int saveUser(User user) {
        int i = 0;
        return i;
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public List<User> listUser() {
        return null;
    }
}
