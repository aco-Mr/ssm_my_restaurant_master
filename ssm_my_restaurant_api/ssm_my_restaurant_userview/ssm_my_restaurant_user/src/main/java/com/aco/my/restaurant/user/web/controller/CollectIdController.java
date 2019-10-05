package com.aco.my.restaurant.user.web.controller;


import com.aco.my.restaurant.user.service.CollectService;
import com.my.restaurant.domain.po.ACollect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollectIdController {
    @Autowired
    private CollectService collectService;

    @RequestMapping("/findCollect")
    public List<ACollect> findByUid(Integer uid){
        List<ACollect> collects = collectService.findByUid(uid);

        return collects;
    }

    //删除
    @RequestMapping("/deleteCollect")
    public Integer findById(Integer collectId){
        Integer row = collectService.findById(collectId);

        return row;
    }


}
