package com.my.restaurant.api.od.web.controller;


import com.my.restaurant.api.od.service.GoodsService;
import com.my.restaurant.api.od.dto.Goods;
import com.my.restaurant.dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    //查找食物的类型
    @RequestMapping("/findGoodsStyle")
    public BaseResult findAllStyle(){
        // 1、通过HttpClient去服务器获取学生记录
        List<Goods> goodsStyle = goodsService.findAllStyle();
        // 2、通过BaseResult将结果返回到客户端
        return BaseResult.success("成功",goodsStyle);
    }

    //根据食物类型显示其菜品
    @RequestMapping("/goodsByType")
    public BaseResult goodsByType(String gtype){
        // 1、通过HttpClient去服务器获取学生记录
        List<Goods> goods = goodsService.goodsByType(gtype);
        // 2、通过BaseResult将结果返回到客户端
        return BaseResult.success("成功",goods);
    }

    @RequestMapping("/findGoodsByName")
    public BaseResult findGoodsByName(String gName){
        List<Goods> goods = goodsService.findGoodsByName(gName);
        return BaseResult.success("成功",goods);
    }




}
