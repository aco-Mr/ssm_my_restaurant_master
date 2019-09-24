package com.aco.my.restaurant.admin.order.service.impl;

import com.aco.my.restaurant.admin.order.dao.OrderDao;
import com.aco.my.restaurant.admin.order.dto.OrderDto;
import com.aco.my.restaurant.admin.order.service.OrderService;
import com.my.restaurant.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public List<Order> findByCondition1(Order order) {
        return orderDao.findByCondition1(order);
    }

    @Override
    public int daleteOrder(Integer oid) {
        return orderDao.daleteOrder(oid);
    }
}
