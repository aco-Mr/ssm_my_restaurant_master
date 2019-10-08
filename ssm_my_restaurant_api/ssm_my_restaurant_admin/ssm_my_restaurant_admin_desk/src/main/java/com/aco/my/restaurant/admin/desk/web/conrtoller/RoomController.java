package com.aco.my.restaurant.admin.desk.web.conrtoller;

import com.aco.my.restaurant.admin.desk.dto.RoomDto;
import com.aco.my.restaurant.admin.desk.service.RoomService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.restaurant.domain.Room;
import com.my.restaurant.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @PostMapping("/list")
    @ResponseBody
    public PageInfo<Room> list(Integer pageNum,Integer pageSize) throws Exception {
//        Room room1 = MapperUtils.json2pojo(room,Room.class);
        PageHelper.startPage(pageNum,pageSize);
        List<Room> list = roomService.findByCondition1(1);
        list.forEach(s-> System.out.println(s));
        PageInfo<Room> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
    @RequestMapping("/insert")
    public int insertRoom(@RequestBody RoomDto roomDto) throws Exception {
//        Room room1 = MapperUtils.json2pojo(room,Room.class);
        System.out.println("!1");
        int rid = roomService.insert(roomDto);
        return rid;
    }
    //当rtype=0时rname和rid的值
    @RequestMapping("/findByName")
    public List<Room> findByRname(){
        List<Room> list = roomService.findByCondition1(0);
        return list;
    }

}
