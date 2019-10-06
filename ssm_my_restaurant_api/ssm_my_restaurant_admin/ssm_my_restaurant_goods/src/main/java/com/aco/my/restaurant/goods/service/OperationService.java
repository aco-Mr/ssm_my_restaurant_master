package com.aco.my.restaurant.goods.service;

import com.aco.my.restaurant.goods.vo.GoodsVo;
import com.aco.my.restaurant.goods.vo.ResultGoods;

import java.util.List;
import java.util.Map;

public interface OperationService {
    ResultGoods<Integer> insertGoods(GoodsVo goodsVo);

    /**
     * 查询全部
     * @return
     */
    ResultGoods<Map<String,Object>> selectAll(Integer pageNum, Integer pageSize);

    /**
     * 按照条件进行查询
     * @param pageNum
     * @param pageSize
     * @param goodsVo
     * @return
     */
    ResultGoods<Map<String,Object>> selectCondition(Integer pageNum,Integer pageSize,GoodsVo goodsVo);

    /**
     * 按条件进行删除
     * @param listGoods
     * @return
     */
    ResultGoods<Integer> delGoods(List<GoodsVo> listGoods);

    /**
     * 修改菜品信息
     * @param goodsVo
     * @return
     */
    ResultGoods<Integer> updateGoods(GoodsVo goodsVo);
}
