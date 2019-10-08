package com.my.restaurant.api.od.dao;

import com.my.restaurant.api.od.dto.Order;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface OrderDao {
    public int saveOrder(Order order);
    public Order findOrderById(Integer oid);
    public int setPay(int oid);
}
