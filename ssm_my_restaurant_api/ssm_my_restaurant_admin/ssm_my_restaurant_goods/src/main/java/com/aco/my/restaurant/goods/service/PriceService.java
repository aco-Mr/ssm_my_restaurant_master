package com.aco.my.restaurant.goods.service;

import com.my.restaurant.domain.Price;

public interface PriceService {
    int insertPrice(Price price);

    /**
     * 按照gid查询最新的价格
     * @param gid
     * @return
     */
    Price selectByGoodsId(Integer gid);
}
