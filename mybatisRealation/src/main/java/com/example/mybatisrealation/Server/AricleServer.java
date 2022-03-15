package com.example.mybatisrealation.Server;

import com.example.mybatisrealation.bean.Aricle;
import com.example.mybatisrealation.bean.Category;

import java.util.List;
import java.util.Map;

public interface AricleServer {
    //通过article id获取具体的文章信息
    Aricle findAricleById(String id);
    //获取的所有分类信息以及分类对应的文章
    List<Category> findAllCategorys();

    public List<Aricle> findbyPage(Map<String,Object> param);

    public long getTotal();
}
