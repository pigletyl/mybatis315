package com.example.mybatis01;

import com.example.mybatis01.mapper.UserMapper;
import com.example.mybatis01.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mybatis01ApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }
    @Test
    public void  test(){
        User user = new User();
        user.setUserId("tyweqtyteqw");
        user.setUserName("zhangsan");
        user.setHobby("swing");
        userMapper.insert(user);
    }

}
