package com.aco.my.restaurant.admin.desk.web.conrtoller;

import com.aco.my.restaurant.admin.desk.service.DeskService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.restaurant.domain.Desk;
import com.my.restaurant.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
@RequestMapping("/desk")
public class DeskController {
    @Autowired
    private DeskService deskService;

    @PostMapping("/list")
    public PageInfo<Desk> list(Integer pageNum,Integer pageSize) throws Exception {
//        Desk desk1 = MapperUtils.json2pojo(desk,Desk.class);
        PageHelper.startPage(pageNum,pageSize);
        List<Desk> list = deskService.findByCondition1(0);
        PageInfo<Desk> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @RequestMapping("/update")
    public Integer updateDeskStatue(Integer did,Integer dstatue){
        int rows = deskService.updateStatue(did,dstatue);
        return rows;
    }

    @PostMapping("/insert")
    public Integer insertDesk(String desk) throws Exception {
        System.out.println("1111");
        Desk desk1 = MapperUtils.json2pojo(desk,Desk.class);
        int rows = deskService.insert(desk1);
        return rows;
    }
}
