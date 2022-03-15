package com.example.mybatisrealation.Server.imp;

import com.example.mybatisrealation.Server.OrderService;
import com.example.mybatisrealation.bean.Orders;
import com.example.mybatisrealation.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@Service
public class OrderServiceImp implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public List<Orders> listAll() {
        return orderMapper.listAll();
    }
}
