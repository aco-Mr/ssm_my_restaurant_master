package com.aco.my.restaurant.user.service;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.PriceDto;
import com.my.restaurant.domain.po.AGoods;

public interface GoodsService {
//    GoodsDto findByGoodsId1(Integer gid);

    GoodsDto findByGoodsId2(Integer gid);

    //找价格
    PriceDto findPriceByGid(Integer gid);

}
