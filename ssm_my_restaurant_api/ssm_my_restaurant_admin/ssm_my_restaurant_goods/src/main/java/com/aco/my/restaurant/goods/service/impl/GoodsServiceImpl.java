package com.aco.my.restaurant.goods.service.impl;

import com.aco.my.restaurant.goods.dao.GoodsMapper;
import com.aco.my.restaurant.goods.service.GoodsService;
import com.my.restaurant.domain.Goods;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    /**
     * 添加
     * @param goods
     * @return
     */
    @Override
    public int insertGoods(Goods goods) {
        return goodsMapper.insertGoods(goods);
    }

    /**
     * 查询
     * @param goods
     * @return
     */
    @Override
    public List<Goods> selectGoods(Goods goods) {
        return goodsMapper.selectGoods(goods);
    }

    /**
     * 删除
     * @param gid
     * @return
     */
    @Override
    public int delGoods(Integer gid) {
        return goodsMapper.delGoods(gid);
    }

    /**
     * 修改
     * @param goods
     * @return
     */
    @Override
    public int updateGood(Goods goods) {
        return goodsMapper.updateGood(goods);
    }
}
