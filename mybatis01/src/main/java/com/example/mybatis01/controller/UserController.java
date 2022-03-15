package com.example.mybatis01.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis01.mapper.UserMapper;
import com.example.mybatis01.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/add")
    public void newUser(){
        for(int i=0;i<10;i++){
            User user = new User();
            user.setUserId("tyweqtyteqw"+i);
            user.setUserName("zhangsan"+i);
            user.setHobby("swing"+i);
            userMapper.insert(user);
        }

    }

    @RequestMapping("/find/{id}")
    public User find(@PathVariable("id") String id){
        User user = userMapper.selectById(id);
        return user;

    }
    @RequestMapping("/findAll")
    public Page<User> findAll(){
        Page<User> page = new Page<>(1,5);
        Page<User> userPage = userMapper.selectPage(page, null);
        return userPage;


    }

}
