package com.aco.my.restaurant.user.web.controller;


import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/findByGoodsId")
    public GoodsDto findByGoodsId(Integer gid){
        GoodsDto goodsId2 = goodsService.findByGoodsId2(gid);
        return goodsId2;
    }


}
