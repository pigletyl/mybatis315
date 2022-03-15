package com.example.mybatisrealation.mapper;

import com.example.mybatisrealation.bean.Aricle;
import com.example.mybatisrealation.bean.Category;

import java.util.List;

public interface ArticleMapper extends BasciMapper<Aricle>{
    //通过article id获取具体的文章信息
    Aricle findAricleById(String id);
    //获取的所有分类信息以及分类对应的文章
    List<Category> findAllCategorys();
}
