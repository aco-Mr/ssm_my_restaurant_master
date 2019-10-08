package com.aco.my.restaurant.user.web.controller;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.OrderDto;
import com.aco.my.restaurant.user.dto.OrderGoodsDto;
import com.aco.my.restaurant.user.service.GoodsService;
import com.aco.my.restaurant.user.service.OrderGoodsService;
import com.aco.my.restaurant.user.service.OrderService;
import com.my.restaurant.domain.po.AOrderGoods;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;
    @Resource
    private GoodsService goodsService;
    @Resource
    private OrderGoodsService orderGoodsService;

    @RequestMapping("/findGoodsIdByOrder")
    public OrderDto findGoodsIdByOrder(Integer oid){
        OrderDto orderDto = orderService.findGoodsIdByOrder(oid);

        return orderDto;
    }
}
