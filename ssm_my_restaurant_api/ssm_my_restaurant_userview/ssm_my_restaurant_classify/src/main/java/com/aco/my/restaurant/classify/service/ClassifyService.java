package com.aco.my.restaurant.classify.service;

import com.my.restaurant.domain.Classify;

import java.util.List;
import java.util.Map;

public interface ClassifyService {
    /**
     * 查询所有订单
     * @return
     */
    public List<Classify> getAll();

    /**
     * 按照时间查询订单
     * @return
     */
    public List<Classify> findDate(Map<String,Object> map);

    /**
     * 新增队伍号码
     * @param classify
     */
    public int addClassify(Classify classify);

    /**
     * 修改
     * @param classify
     */
    public int createClassify(Classify classify);
}
