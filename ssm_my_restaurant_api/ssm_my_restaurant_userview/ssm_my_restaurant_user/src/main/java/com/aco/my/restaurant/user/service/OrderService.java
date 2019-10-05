package com.aco.my.restaurant.user.service;


import com.aco.my.restaurant.user.dto.OrderDto;
import com.aco.my.restaurant.user.dto.OrderGoodsDto;

import java.util.Set;

public interface OrderService {
    //通过oid找中间表
    OrderDto findGoodsIdByOrder(Integer oid);
}
