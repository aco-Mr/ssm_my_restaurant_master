package com.aco.my.restaurant.user.service.impl;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.PriceDto;
import com.aco.my.restaurant.user.mapper.AGoodsMapper;
import com.aco.my.restaurant.user.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private AGoodsMapper aGoodsMapper;
//
//    @Override
//    public GoodsDto findByGoodsId1(Integer gid) {
//        return aGoodsMapper.findByGoodsId1(gid);
//    }

    @Override
    public GoodsDto findByGoodsId2(Integer gid) {
        return aGoodsMapper.findByGoodsId2(gid);
    }

    @Override
    public PriceDto findPriceByGid(Integer gid) {
        return aGoodsMapper.findPriceByGid(gid);
    }
}
