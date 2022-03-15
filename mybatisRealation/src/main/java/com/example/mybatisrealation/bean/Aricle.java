package com.example.mybatisrealation.bean;

import lombok.Data;

import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@Data
public class Aricle {
    private String id;
    private String title;
    private String content;
    private List<Category> categories;
}
