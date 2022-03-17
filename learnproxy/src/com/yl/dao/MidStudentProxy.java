package com.yl.dao;

/*
 * @Author yang
 * @Description //TODO $ 学习代理模式 中学生类的一个代理对象(静态代理)
 * @Date
 **/
public class MidStudentProxy {
    private MidStudent midStudent;
    public  MidStudentProxy(MidStudent midStudent){
        this.midStudent=midStudent;
    }

  

    public void readBook(){
        readBookBefore();
        midStudent.readBook();
        readBookAfter();
    }
    public void readBookBefore(){
        System.out.println("读书前的一系列的操作：从书包拿出书等等");
    }
    public void readBookAfter(){
        System.out.println("扔掉书，去吃饭了，读书后的一系列的操作");
    }
}
