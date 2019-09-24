package com.my.restaurant.api.od.web.controller;

import com.my.restaurant.api.od.service.RoomService;
import com.my.restaurant.domain.Room;
import com.my.restaurant.dto.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @RequestMapping("/findRooms")
    public BaseResult findAll(){
        // 1、通过HttpClient去服务器获取学生记录
        List<Room> rooms = roomService.findAll();
        // 2、通过BaseResult将结果返回到客户端
        return BaseResult.success("成功",rooms);
    }
}
