package com.aco.my.restaurant.user.service.impl;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.OrderGoodsDto;
import com.aco.my.restaurant.user.mapper.AOrderGoodsMapper;
import com.aco.my.restaurant.user.service.OrderGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class OrderGoodsServiceImpl implements OrderGoodsService {
    @Resource
    private AOrderGoodsMapper aOrderGoodsMapper;

    @Override
    public OrderGoodsDto findGoods(Integer oid,Integer gid) {
        return aOrderGoodsMapper.findGoods(oid,gid);
    }
}
