package com.aco.my.restaurant.user.mapper;

import com.aco.my.restaurant.user.dto.OrderDto;
import com.aco.my.restaurant.user.dto.OrderGoodsDto;
import com.my.restaurant.domain.po.AOrder;

import java.util.Set;

public interface AOrderMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(AOrder record);

    int insertSelective(AOrder record);

    AOrder selectByPrimaryKey(Integer oid);

    int updateByPrimaryKeySelective(AOrder record);

    int updateByPrimaryKey(AOrder record);

    //通过oid找中间表
    public OrderDto findGoodsIdByOrder(Integer oid);
}