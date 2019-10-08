package com.aco.my.restaurant.admin.order.dao;

import com.aco.my.restaurant.admin.order.dto.OrderDto;
import com.my.restaurant.domain.Order;
import org.apache.ibatis.annotations.Param;
import org.aspectj.weaver.ast.Or;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDao {

//     按条件查询
    public List<OrderDto> findByCondition1(@Param("uname") String uname,@Param("startDateTime") String startDateTime,@Param("val") Integer val,@Param("date") String date);

    //修改
    public int updateOrder(@Param("oid") Integer oid , @Param("isPay") Integer isPay);

    //删除
    public int daleteOrder(Integer oid);

    //新增
    public  int insertOreder(Order order);
}
