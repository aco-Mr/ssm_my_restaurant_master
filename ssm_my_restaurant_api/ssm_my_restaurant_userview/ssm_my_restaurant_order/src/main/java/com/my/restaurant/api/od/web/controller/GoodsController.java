package com.my.restaurant.api.od.web.controller;


import com.my.restaurant.api.od.service.GoodsService;
import com.my.restaurant.domain.Goods;
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

    @RequestMapping("/findGoodsStyle")
    public BaseResult findAllStyle(){
        // 1、通过HttpClient去服务器获取学生记录
        List<Goods> goodsStyle = goodsService.findAllStyle();
        // 2、通过BaseResult将结果返回到客户端
        return BaseResult.success("成功",goodsStyle);
    }

}
