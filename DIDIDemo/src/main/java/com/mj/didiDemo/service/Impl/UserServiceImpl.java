package com.mj.didiDemo.service.Impl;

import com.mj.didiDemo.domain.User;
import com.mj.didiDemo.mapper.UserMapper;
import com.mj.didiDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhoujian123@hotmail.com 2018/5/19 15:25
 */
@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        System.out.println("开始去查询id"+id);
        return userMapper.getUserById(id);
    }
}
