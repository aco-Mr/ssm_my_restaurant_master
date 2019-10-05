package com.aco.my.restaurant.user.mapper;

import com.aco.my.restaurant.user.dto.GoodsDto;
import com.aco.my.restaurant.user.dto.OrderGoodsDto;
import com.my.restaurant.domain.po.AOrderGoods;

import java.util.Set;

public interface AOrderGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AOrderGoods record);

    int insertSelective(AOrderGoods record);

    AOrderGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AOrderGoods record);

    int updateByPrimaryKey(AOrderGoods record);

    //  //通过gid查找菜品
    OrderGoodsDto findGoods(Integer oid,Integer gid);

    OrderGoodsDto findGoodsByGid(Integer oid);
}