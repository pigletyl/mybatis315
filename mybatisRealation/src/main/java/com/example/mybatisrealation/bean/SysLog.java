package com.example.mybatisrealation.bean;

import lombok.Data;

import java.util.Date;

/*
 * @Author yang
 * @Description //TODO $系统日志bean
 * @Date
 **/
@Data
public class SysLog {
    private int id;
    private int userId;
    private String userAction;
    private Date createTime;
}
