package com.yl.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * @Author yang
 * @Description //TODO $ 动态代理使用jdk的Proxy实现。缺点：代理对象必须实现了接口，不然无法完成代理
 * @Date
 **/
public class DynamicProxy {
    MidStudent midStudent = new MidStudent();
    public StudentDao getMidStudentProxy(){
        return (StudentDao) Proxy.newProxyInstance(MidStudent.class.getClassLoader(), MidStudent.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if("readBook".equals(method.getName())){
                    System.out.println("读书前的一系列的操作：从书包拿出书等等");
                    method.invoke(midStudent,args);
                    System.out.println("扔掉书，去吃饭了，读书后的一系列的操作");
                }
                return null;
            }
        });
    }
}
