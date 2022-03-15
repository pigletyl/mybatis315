package com.example.mybatisrealation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisrealation.mapper")
public class MybatisRealationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisRealationApplication.class, args);
    }

}
