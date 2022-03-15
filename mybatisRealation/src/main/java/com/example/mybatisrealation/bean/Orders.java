package com.example.mybatisrealation.bean;

import lombok.Data;

import java.util.Date;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@Data
public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createTime;
    private String note;
    private User user;
}
