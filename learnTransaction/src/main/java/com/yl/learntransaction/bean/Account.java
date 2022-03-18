package com.yl.learntransaction.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@Data
public class Account {
    private String id;
    private String name;
    private BigDecimal money;
    private Date createTime;
}
