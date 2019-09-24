package com.aco.my.restaurant.admin.order.web.controller;

import com.aco.my.restaurant.admin.order.dto.OrderDto;
import com.aco.my.restaurant.admin.order.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.restaurant.domain.Order;
import com.my.restaurant.utils.MapperUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/list")
    public PageInfo<Order> list(String order,Integer pageNum,Integer pageSize) throws Exception {
        System.out.println("list");
        System.out.println("order:"+order);
        Order order1 = MapperUtils.json2pojo(order,Order.class);
        System.out.println("order1:"+order1);
        PageHelper.startPage(pageNum,pageSize);
//        System.out.println("order:"+order);
        List<Order> list = orderService.findByCondition1(order1);
        list.forEach(s-> System.out.println(s));
        //将Po的数据拷贝到Dto中
//        List<OrderDto> list1 = new ArrayList<>();
//        BeanUtils.copyProperties(list,list1);
        PageInfo<Order> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
