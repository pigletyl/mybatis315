package com.yl.learntransaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yl.learntransaction.mapper")
public class LearnTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnTransactionApplication.class, args);
    }

}
