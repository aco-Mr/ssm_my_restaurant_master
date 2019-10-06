package com.aco.my.restaurant.goods.service.impl;

import com.aco.my.restaurant.goods.dao.PriceMapper;
import com.aco.my.restaurant.goods.service.PriceService;
import com.my.restaurant.domain.Price;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(rollbackFor = Exception.class)
public class PriceServiceImpl implements PriceService {
    @Resource
    private PriceMapper priceMapper;
    @Override
    public int insertPrice(Price price) {
        return priceMapper.insertPrice(price);
    }

    /**
     * 按照gid查询最新的价格
     * @param gid
     * @return
     */
    public Price selectByGoodsId(Integer gid){
        return priceMapper.selectByGoodsId(gid);
    }
}
