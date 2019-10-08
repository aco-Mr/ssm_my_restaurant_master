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
    public List<OrderDto> findByCondition1(String uname,String startDateTime,Integer val, String date) {
        return orderDao.findByCondition1(uname,startDateTime,val,date);
    }

    @Override
    public int updateOrder(Integer oid, Integer isPay) {
        return orderDao.updateOrder(oid,isPay);
    }

    @Override
    public int daleteOrder(Integer oid) {
        return orderDao.daleteOrder(oid);
    }

    @Override
    public int insertOreder(Order order) {
        return orderDao.insertOreder(order);
    }

}
