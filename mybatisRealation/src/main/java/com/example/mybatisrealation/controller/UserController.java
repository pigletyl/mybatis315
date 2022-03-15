package com.example.mybatisrealation.controller;

import com.example.mybatisrealation.Server.OrderService;
import com.example.mybatisrealation.Server.UserService;
import com.example.mybatisrealation.bean.Orders;
import com.example.mybatisrealation.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @Author yang
 * @Description //TODO $
 * @Date $ $
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;
    @RequestMapping("/get")
    public User get(String id){
        return userService.findById(id);
    }

    @RequestMapping("/getAllOrders")
    public List<Orders> getAllOrders(){
        return orderService.listAll();
    }
}
