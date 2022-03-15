package com.example.mybatisrealation.Server.imp;

import com.example.mybatisrealation.Server.UserService;
import com.example.mybatisrealation.bean.User;
import com.example.mybatisrealation.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@Service
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }
}
