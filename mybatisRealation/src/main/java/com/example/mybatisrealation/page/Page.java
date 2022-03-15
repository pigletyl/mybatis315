package com.example.mybatisrealation.page;

import lombok.Data;

import java.util.List;

/*
 * @Author yang
 * @Description //TODO $自定一个分页类
 * @Date
 **/
@Data
public class Page<T> {
    private int page;
    private int size;
    private List<T> rows;
    private long count;
}
