package com.my.restaurant.api.od.service.impl;

import com.my.restaurant.api.od.dao.GoodsDao;
import com.my.restaurant.api.od.service.GoodsService;
import com.my.restaurant.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;
    @Override
    public List<Goods> findAllStyle() {
        return goodsDao.findAllStyle();
    }

    @Override
    public List<Goods> goodsByType(String gtype) {
        return goodsDao.goodsByType(gtype);
    }
}
