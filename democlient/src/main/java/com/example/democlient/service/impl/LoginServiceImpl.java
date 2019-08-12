package com.example.democlient.service.impl;

import com.example.democlient.dao.UserMapper;
import com.example.democlient.pojo.User;
import com.example.democlient.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;

    public User getUser(Long id){

        return userMapper.getUser(id);
    };
}
