package com.my.restaurant.api.od.service;

import com.my.restaurant.api.od.dto.Order;

public interface OrderService {
    public int saveOrder(Order order);
    public Order findOrderById(Integer oid);
    public int setPay(Integer oid);
}
