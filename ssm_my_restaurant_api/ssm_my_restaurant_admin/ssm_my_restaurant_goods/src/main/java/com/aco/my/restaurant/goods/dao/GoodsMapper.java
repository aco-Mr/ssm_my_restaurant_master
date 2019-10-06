package com.aco.my.restaurant.goods.dao;

import com.my.restaurant.domain.Goods;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    /**
     * 插入菜品信息，可以返回自增id
     * @param goods
     * @return
     */
    int insertGoods(@Param("goods") Goods goods);

    /**
     * 按条件查询
     * @param goods
     * @return
     */
    List<Goods> selectGoods(@Param("goods") Goods goods);

    /**
     * 进行菜品的删除效果
     * @param gid
     * @return
     */
    int delGoods(@Param("gid") Integer gid);

    /**
     * 修改菜品信息
     * @param goods
     * @return
     */
    int updateGood(@Param("goods") Goods goods);
}