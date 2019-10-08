package com.aco.my.restaurant.user.mapper;

import com.my.restaurant.domain.po.APrice;

public interface APriceMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(APrice record);

    int insertSelective(APrice record);

    APrice selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(APrice record);

    int updateByPrimaryKey(APrice record);
}