package com.aco.my.restaurant.goods.service;

import com.my.restaurant.domain.Goods;

import java.util.List;

public interface GoodsService {
    /**
     * 插入菜品信息，可以返回自增id
     * @param goods
     * @return
     */
    int insertGoods(Goods goods);
    /**
     * 按条件查询
     * @param goods
     * @return
     */
    List<Goods> selectGoods(Goods goods);

    /**
     * 进行菜品的删除效果
     * @param gid
     * @return
     */
    int delGoods(Integer gid);

    /**
     * 修改菜品信息
     * @param goods
     * @return
     */
    int updateGood(Goods goods);
}
