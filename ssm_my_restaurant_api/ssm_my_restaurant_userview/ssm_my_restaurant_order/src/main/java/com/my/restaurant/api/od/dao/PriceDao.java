package com.my.restaurant.api.od.dao;

import com.my.restaurant.api.od.dto.Price;

import java.util.List;

public interface PriceDao {
    public List<Price> findByGoodsId(Integer gid);
}
