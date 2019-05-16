package com.hundsun.service;


import com.hundsun.domain.User;

import java.util.List;

public interface UserService {
    int saveUser(User user);
    User getUser();
    List<User> listUser();
}
