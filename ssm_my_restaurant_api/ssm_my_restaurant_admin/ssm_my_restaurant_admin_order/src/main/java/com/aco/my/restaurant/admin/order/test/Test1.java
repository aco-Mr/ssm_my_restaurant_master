package com.aco.my.restaurant.admin.order.test;

import com.aco.my.restaurant.admin.order.dto.OrderDto;
import com.aco.my.restaurant.admin.order.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.restaurant.domain.Order;
import com.my.restaurant.utils.MapperUtils;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-context.xml",
        "classpath:spring-context-druid.xml",
        "classpath:spring-context-mybatis.xml"

})
public class Test1 {
    @Autowired
    private OrderService orderService;
//    @Test
//    public void test(){
//        Order order = new Order();
//        List<Order> list = orderService.findByCondition1(order);
//        List<OrderDto> list1 = new ArrayList<>();
//        BeanUtils.copyProperties(list,list1);
//        for(Order l:list){
//            System.out.println(l);
//        }
//    }
}
