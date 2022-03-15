package com.example.mybatis01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatis01.mapper")
@SpringBootApplication
public class Mybatis01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis01Application.class, args);
    }

}
