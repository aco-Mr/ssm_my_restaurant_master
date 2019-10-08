package com.my.restaurant.api.od.service.impl;

import com.my.restaurant.api.od.dao.OrderDao;
import com.my.restaurant.api.od.dto.Order;
import com.my.restaurant.api.od.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;
    @Override
    public int saveOrder(Order order){
     return orderDao.saveOrder(order);
    }

    @Override
    public Order findOrderById(Integer oid) {
        return orderDao.findOrderById(oid);
    }

    @Override
    public int setPay(Integer oid) {
        return orderDao.setPay(oid);
    }
}
