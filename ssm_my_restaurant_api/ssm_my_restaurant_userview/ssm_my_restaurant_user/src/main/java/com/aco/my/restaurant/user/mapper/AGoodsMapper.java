package com.aco.my.restaurant.user.mapper;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.PriceDto;
import com.my.restaurant.domain.po.AGoods;

public interface AGoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(AGoods record);

    int insertSelective(AGoods record);

    AGoods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(AGoods record);

    int updateByPrimaryKey(AGoods record);

//    GoodsDto findByGoodsId1(Integer gid);

    GoodsDto findByGoodsId2(Integer gid);

    //找价格
    PriceDto findPriceByGid(Integer gid);
}