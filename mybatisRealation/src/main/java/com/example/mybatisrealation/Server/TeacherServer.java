package com.example.mybatisrealation.Server;

import com.example.mybatisrealation.bean.Aricle;
import com.example.mybatisrealation.bean.St;
import com.example.mybatisrealation.bean.Teacher;

import java.util.List;
import java.util.Map;

public interface TeacherServer {
    List<Teacher> findAllTechers();
    List<St> findview();
    public List<Teacher> findbyPage(Map<String,Object> param);
}
