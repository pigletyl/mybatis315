package com.example.mybatisrealation.mapper;

import com.example.mybatisrealation.bean.User;

public interface UserMapper {
    User findById(String id);
}
