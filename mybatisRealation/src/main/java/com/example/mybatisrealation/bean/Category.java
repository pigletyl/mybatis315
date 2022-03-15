package com.example.mybatisrealation.bean;

import lombok.Data;

import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@Data
public class Category {
    private String id;
    private String name;
    private List<Aricle> aricles;
}
