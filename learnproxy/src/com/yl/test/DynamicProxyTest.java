package com.yl.test;

import com.yl.dao.DynamicProxy;
import com.yl.dao.MidStudent;
import com.yl.dao.StudentDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * @Author yang
 * @Description //TODO $  动态代理，jdk原生的
 * @Date
 **/
public class DynamicProxyTest {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy = new DynamicProxy();
        StudentDao studentDao = dynamicProxy.getMidStudentProxy();
        studentDao.readBook();
    }
}
