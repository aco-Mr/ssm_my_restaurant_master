package com.aco.my.restaurant.admin.order.web.controller;

import com.aco.my.restaurant.admin.order.dto.OrderDto;
import com.aco.my.restaurant.admin.order.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.restaurant.domain.Order;
import com.my.restaurant.dto.BaseResult;
import com.my.restaurant.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/list")
    public PageInfo<OrderDto> list(String uname,String startDateTime,Integer val,Integer pageNum, Integer pageSize) throws Exception {
//        OrderDto orderDto = (OrderDto) MapperUtils.json2pojo(order, Order.class);
        Date t = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(t);
        System.out.println(date);
        PageHelper.startPage(pageNum, pageSize);
        List<OrderDto> list = orderService.findByCondition1(uname,startDateTime,val,date);
        list.forEach(s -> System.out.println(s));
        //将Po的数据拷贝到Dto中
//        List<OrderDto> list1 = new ArrayList<>();
//        BeanUtils.copyProperties(list,list1);
        PageInfo<OrderDto> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
//    @RequestMapping("/getOrder")
//    public BaseResult getOrder(Order order){
//        List<Order> list = orderService.findByCondition1(order);
//        return BaseResult.success("成功",list);
//    }
//
//    @RequestMapping("/update")
//    public Integer updateOrder(Integer oid,Integer isPay){
//        return orderService.updateOrder(oid,isPay);
//    }
//    @RequestMapping("/delete")
//    public Integer deleteOrder(Integer oid){
//        return orderService.daleteOrder(oid);
//    }
//
//    @RequestMapping("/insert")
//    public Integer insertOrder(Order order){
//        return  orderService.insertOreder(order);
//    }
//}
