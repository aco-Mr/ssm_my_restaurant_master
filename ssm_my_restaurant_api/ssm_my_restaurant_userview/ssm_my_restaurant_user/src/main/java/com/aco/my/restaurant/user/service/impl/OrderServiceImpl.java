package com.aco.my.restaurant.user.service.impl;

import com.aco.my.restaurant.user.dto.OrderDto;
import com.aco.my.restaurant.user.dto.OrderGoodsDto;
import com.aco.my.restaurant.user.mapper.AOrderMapper;
import com.aco.my.restaurant.user.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private AOrderMapper aOrderMapper;

    @Override
    public OrderDto findGoodsIdByOrder(Integer oid) {
        return aOrderMapper.findGoodsIdByOrder(oid);
    }
}
