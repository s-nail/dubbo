package com.hundsun.dao;


import com.hundsun.domain.User;

import java.util.List;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    List<User> listUser();
}