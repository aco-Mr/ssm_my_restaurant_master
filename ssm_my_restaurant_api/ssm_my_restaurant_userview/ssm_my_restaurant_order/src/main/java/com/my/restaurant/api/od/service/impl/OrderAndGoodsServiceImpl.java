package com.my.restaurant.api.od.service.impl;

import com.my.restaurant.api.od.dao.OrderAndGoodsDao;
import com.my.restaurant.api.od.dto.OrderAndGoods;
import com.my.restaurant.api.od.service.OrderAndGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderAndGoodsServiceImpl implements OrderAndGoodsService {

    @Autowired
    private OrderAndGoodsDao orderAndGoodsDao;
    @Override
    public int saveInfo(OrderAndGoods orderAndGoods){
        return orderAndGoodsDao.insetInfo(orderAndGoods);
    }
}
