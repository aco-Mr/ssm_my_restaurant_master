package com.my.restaurant.api.od.dao;

import com.my.restaurant.api.od.dto.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsDao {
    public List<Goods> findAllStyle();
    public List<Goods> goodsByType(String gtype);
    public List<Goods> findByOrderId(Integer oid);
    List<Goods> findGoodsByName(String gName);
}
