package com.my.restaurant.api.od.dao;


import com.my.restaurant.api.od.dto.OrderAndGoods;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderAndGoodsDao {
   public int insetInfo(OrderAndGoods orderAndGoods);
}