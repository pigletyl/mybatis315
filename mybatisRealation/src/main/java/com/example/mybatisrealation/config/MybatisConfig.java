package com.example.mybatisrealation.config;

import com.example.mybatisrealation.interceptor.MyPageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @Author yang
 * @Description //TODO $
 * @Date
 **/
@Configuration
@MapperScan("com.example.mybatisrealation.mapper")
public class MybatisConfig {
    @Bean
    public MyPageInterceptor myPageInterceptor(){
        return new MyPageInterceptor();
    }
}
