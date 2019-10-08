package com.aco.my.restaurant.user.service;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.OrderGoodsDto;

import java.util.Set;

public interface OrderGoodsService {
    //  //通过菜品id和oid查找菜品号
    OrderGoodsDto findGoods(Integer oid,Integer gid);
}
