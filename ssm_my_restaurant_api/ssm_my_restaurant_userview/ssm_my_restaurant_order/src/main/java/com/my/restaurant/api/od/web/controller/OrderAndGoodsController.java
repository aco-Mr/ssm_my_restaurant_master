package com.my.restaurant.api.od.web.controller;

import com.alibaba.fastjson.JSONArray;
import com.my.restaurant.api.od.dto.Order;
import com.my.restaurant.api.od.dto.OrderAndGoods;
import com.alibaba.fastjson.JSONArray;
import com.my.restaurant.api.od.service.OrderAndGoodsService;
import com.my.restaurant.api.od.service.OrderService;
import com.my.restaurant.dto.BaseResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/orderAndGoods")
public class OrderAndGoodsController {

    @Resource
    private OrderAndGoodsService orderAndGoodsService;


    @RequestMapping("/saveInfo")
    public BaseResult saveInfo(@RequestBody String orderAndGoodsList) {
        System.out.println(orderAndGoodsList);
        List<OrderAndGoods> orderAndGoodsList1 = JSONArray.parseArray(orderAndGoodsList, OrderAndGoods.class);
        System.out.println(orderAndGoodsList1);
        for (int i = 0; i < orderAndGoodsList1.size(); i++) {
            orderAndGoodsService.saveInfo(orderAndGoodsList1.get(i));
            System.out.println(orderAndGoodsList1.get(i));
        }
        return BaseResult.success("成功");
    }

}

