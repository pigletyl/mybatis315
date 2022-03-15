package com.example.mybatisrealation.bean;

import lombok.Data;

import java.util.Date;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@Data
public class User {
    private int id;
    private String username;
    private String sex;
    private Date birthday;
    private String address;
}
