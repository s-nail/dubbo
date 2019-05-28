package com.hundsun.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hundsun.dao.UserMapper;
import com.hundsun.domain.User;
import com.hundsun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Date;
import java.util.List;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    //@Transactional(rollbackFor = Exception.class)
    public int saveUser(User user) {
        int i = 0;
        try {
            i = userMapper.insert(user);
            System.out.println("Time:" + new Date() + "，插入条数：" + i);
            List<User> list = userMapper.listUser();
            System.out.println("================================================");
            System.out.println(list);
            System.out.println("================================================");
            //制造异常
            user.setId(1);
            userMapper.insert(user);
            System.out.println("Time:" + new Date() + "，插入条数：" + i);
        }catch (Exception e){
            System.out.println("===================回滚？============================="+e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return i;
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
