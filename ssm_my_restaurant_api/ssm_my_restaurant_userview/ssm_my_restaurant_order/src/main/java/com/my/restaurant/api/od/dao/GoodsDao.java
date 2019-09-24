package com.my.restaurant.api.od.dao;

import com.my.restaurant.domain.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    public List<Goods> findAllStyle();
    public List<Goods> goodsByType(String gtype);
}
