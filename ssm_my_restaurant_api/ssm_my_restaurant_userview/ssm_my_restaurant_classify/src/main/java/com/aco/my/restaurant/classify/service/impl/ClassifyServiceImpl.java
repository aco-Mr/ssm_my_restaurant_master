package com.aco.my.restaurant.classify.service.impl;

import com.aco.my.restaurant.classify.dao.ClassifyDao;
import com.aco.my.restaurant.classify.service.ClassifyService;
import com.my.restaurant.domain.Classify;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private ClassifyDao classifyDao;

    @Override
    public List<Classify> getAll() {
        return classifyDao.getAll();
    }

    @Override
    public List<Classify> findDate(Map<String,Object> map) {
        return classifyDao.findDate(map);
    }

    @Override
    public int addClassify(Classify classify) {
        int rows = classifyDao.addClassify(classify);
        return rows;
    }

    @Override
    public int createClassify(Classify classify) {
        int rows = classifyDao.createClassify(classify);
        return rows;
    }
}
