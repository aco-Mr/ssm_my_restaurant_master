package com.aco.my.restaurant.user.web.controller;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.OrderGoodsDto;
import com.aco.my.restaurant.user.service.GoodsService;
import com.aco.my.restaurant.user.service.OrderGoodsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderGoodsController {
    @Resource
    private OrderGoodsService orderGoodsService;
    @Resource
    private GoodsService goodsService;

    @RequestMapping("/findGoods")
    public GoodsDto findGoods(Integer oid,Integer gid){
        OrderGoodsDto goods = orderGoodsService.findGoods(oid, gid);

        //通过菜品找价格
        GoodsDto goodsDto = goodsService.findByGoodsId2(gid);
        return goodsDto;
    }
}
