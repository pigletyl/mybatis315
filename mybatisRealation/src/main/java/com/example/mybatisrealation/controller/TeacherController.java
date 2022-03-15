package com.example.mybatisrealation.controller;

import com.example.mybatisrealation.Server.TeacherServer;
import com.example.mybatisrealation.bean.Aricle;
import com.example.mybatisrealation.bean.St;
import com.example.mybatisrealation.bean.Teacher;
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
 * @Date $ $
 **/
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherServer teacherServer;
    @RequestMapping("/list")
    public List<Teacher> lists(){
        return  teacherServer.findAllTechers();
    }

    @RequestMapping("/view")
    @Log("老师类中的视图方法")
    public List<St> view(){
        return  teacherServer.findview();
    }

    @RequestMapping("/pageList")
    public Page<Teacher> pageList(int p, int size){
        Page<Teacher> page = new Page();
        page.setPage(p);
        page.setSize(size);

        Map<String,Object> map = new HashMap<>();
        map.put("page",p);
        map.put("size",size);
        List<Teacher> teachers = teacherServer.findbyPage(map);
        page.setRows(teachers);
        return  page;
    }
}
