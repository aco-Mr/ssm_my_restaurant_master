package com.aco.my.restaurant.admin.order.service;

import com.aco.my.restaurant.admin.order.dto.OrderDto;
import com.my.restaurant.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    // 按条件查询
    public List<OrderDto> findByCondition1(@Param("uname") String uname,@Param("startDateTime") String startDateTime,@Param("val") Integer val,@Param("date") String date);
    //修改
    public int updateOrder(@Param("oid") Integer oid , @Param("isPay") Integer isPay);

    //删除
    public int daleteOrder(Integer oid);

    //新增
    public  int insertOreder(Order order);

}
