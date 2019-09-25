package com.aco.my.restaurant.admin.order.dao;

import com.my.restaurant.domain.Order;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDao {

    // 按条件查询
    public List<Order> findByCondition1(Order order);
    //删除订单
    public int daleteOrder(Integer oid);

}
