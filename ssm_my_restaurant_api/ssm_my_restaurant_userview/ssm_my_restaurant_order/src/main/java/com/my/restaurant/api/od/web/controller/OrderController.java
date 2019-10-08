package com.my.restaurant.api.od.web.controller;

import com.my.restaurant.api.od.dto.Order;
import com.my.restaurant.api.od.service.DeskService;
import com.my.restaurant.api.od.service.OrderAndGoodsService;
import com.my.restaurant.api.od.service.OrderService;
import com.my.restaurant.dto.BaseResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @Resource
    private DeskService deskService;

    @RequestMapping("/saveOrder")
    public BaseResult saveOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
        Integer oid = order.getOid();
        return BaseResult.success("成功",oid);
    }

    @RequestMapping("/findOrderById")
    public BaseResult findOrderById(String oid){
        Order order = orderService.findOrderById(Integer.parseInt(oid));
        // 2、通过BaseResult将结果返回到客户端
        return BaseResult.success("成功",order);
    }

    @RequestMapping("/setPay")
    public BaseResult  setPay(String oid){
        Order order= orderService.findOrderById(Integer.parseInt(oid));
        String dids= order.getDid();
        String[] did = dids.split(",");
        if (did!=null&&did.length>0) {
            for (int i = 0; i < did.length; i++) {
                deskService.updateStatue(Integer.parseInt(did[i]));
            }
        }
        orderService.setPay(Integer.parseInt(oid));
        return BaseResult.success("成功");
    }
}
