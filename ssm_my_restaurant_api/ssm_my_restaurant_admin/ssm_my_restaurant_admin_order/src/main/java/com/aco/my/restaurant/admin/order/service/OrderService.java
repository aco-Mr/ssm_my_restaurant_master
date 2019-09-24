package com.aco.my.restaurant.admin.order.service;

import com.my.restaurant.domain.Order;

import java.util.List;

public interface OrderService {
    //查全部订单
    public List<Order> findAll();
    // 按条件查询
    public List<Order> findByCondition1(Order order);
    //删除订单
    public int daleteOrder(Integer oid);
}
