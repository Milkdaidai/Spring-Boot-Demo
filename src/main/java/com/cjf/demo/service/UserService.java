package com.cjf.demo.service;

import com.cjf.demo.mapper.UserMapper;
import com.cjf.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User Service
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


//    public void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
