package com.my.restaurant.api.od.web.controller;


import com.my.restaurant.api.od.service.DeskService;
import com.my.restaurant.domain.Desk;
import com.my.restaurant.dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/desk")
public class DeskController {
    @Autowired
    private DeskService deskService;

    @RequestMapping("/findRoomDesk")
    public BaseResult findRoomDesk(int rid ){
        // 1、通过HttpClient去服务器获取学生记录
        List<Desk> roomDesk = deskService.findRoomDesk(rid);
        // 2、通过BaseResult将结果返回到客户端
        return BaseResult.success("成功",roomDesk);
    }

}
