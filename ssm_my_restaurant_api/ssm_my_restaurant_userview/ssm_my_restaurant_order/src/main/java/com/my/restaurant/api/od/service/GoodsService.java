package com.my.restaurant.api.od.service;

import com.my.restaurant.api.od.dto.Goods;

import java.util.List;

public interface GoodsService {
    public List<Goods> findAllStyle();
    public List<Goods> goodsByType(String gtype);
    List<Goods> findGoodsByName(String gName);
}
