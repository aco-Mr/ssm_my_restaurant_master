package com.my.restaurant.api.od.web.controller;

import com.my.restaurant.api.od.service.RoomService;
import com.my.restaurant.api.od.dto.Room;
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

    //根据包厢或大厅查找其房间
    @RequestMapping("/findRooms")
    public BaseResult findAll(String rtype){
        // 1、通过HttpClient去服务器获取学生记录
        List<Room> rooms = roomService.findAll(rtype);
        // 2、通过BaseResult将结果返回到客户端
        return BaseResult.success("成功",rooms);
    }

    //查找包厢或大厅
    @RequestMapping("/findRoomType")
    public BaseResult findRoomType(){
        List<Room> roomType = roomService.findRoomType();
        return BaseResult.success("成功",roomType);
    }
}
