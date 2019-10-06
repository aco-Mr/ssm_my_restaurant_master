package com.aco.my.restaurant.goods.dao;

import com.my.restaurant.domain.Price;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriceMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Price record);

    int insertSelective(Price record);

    Price selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Price record);

    int updateByPrimaryKey(Price record);

    /**
     * 插入价格
     * @param price
     * @return
     */
    int insertPrice(@Param("price") Price price);

    /**
     * 按照gid查询最新的价格
     * @param gid
     * @return
     */
    Price selectByGoodsId(@Param("gid") Integer gid);
}