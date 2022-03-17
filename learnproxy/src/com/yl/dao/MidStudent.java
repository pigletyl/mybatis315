package com.yl.dao;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
public class MidStudent implements StudentDao{
    @Override
    public void readBook() {
        System.out.println("中学生在读书");
    }
}
