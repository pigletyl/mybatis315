package com.yl.test;

import com.yl.dao.MidStudent;
import com.yl.dao.MidStudentProxy;

/*
 * @Author yang
 * @Description //TODO $ 测试静态代理
 * @Date
 **/
public class StaticProxyTest {
    public static void main(String[] args) {
        MidStudent midStudent = new MidStudent();
        MidStudentProxy proxy = new MidStudentProxy(midStudent);
        proxy.readBook();
    }
}
