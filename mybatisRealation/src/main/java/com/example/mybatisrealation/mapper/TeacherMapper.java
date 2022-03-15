package com.example.mybatisrealation.mapper;

import com.example.mybatisrealation.bean.St;
import com.example.mybatisrealation.bean.Student;
import com.example.mybatisrealation.bean.Teacher;

import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
public interface TeacherMapper extends BasciMapper<Teacher>{

    List<Teacher> findAllTechers();

    List<St> findview();
}
