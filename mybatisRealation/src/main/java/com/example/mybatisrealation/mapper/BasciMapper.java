package com.example.mybatisrealation.mapper;

import java.util.List;
import java.util.Map;

public interface BasciMapper<T> {
    public List<T> findbyPage(Map<String,Object> param);
    public long getTotal();
}
