package com.example.mybatisrealation.controller;

import com.example.mybatisrealation.Server.AricleServer;
import com.example.mybatisrealation.bean.Aricle;
import com.example.mybatisrealation.bean.Category;
import com.example.mybatisrealation.config.Log;
import com.example.mybatisrealation.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private AricleServer aricleServer;
    @RequestMapping("/get")
    @Log("获取方法被执行了")
    public Aricle get(String id){
        return  aricleServer.findAricleById(id);
    }
    @RequestMapping("/getAllCategory")
    public List<Category> getAllCategory(String id){
        return  aricleServer.findAllCategorys();
    }

    @RequestMapping("/pageList")
    public Page<Aricle> pageList(int p,int size){
        Page<Aricle> page = new Page();
        page.setPage((p-1)*size);
        page.setSize(size==0?5:size);
        Map<String,Object> map = new HashMap<>();
        map.put("page",(p-1)*size);
        map.put("size",size);
        List<Aricle> aricles = aricleServer.findbyPage(map);
        page.setRows(aricles);
        page.setCount(aricleServer.getTotal());
        return  page;
    }
}
