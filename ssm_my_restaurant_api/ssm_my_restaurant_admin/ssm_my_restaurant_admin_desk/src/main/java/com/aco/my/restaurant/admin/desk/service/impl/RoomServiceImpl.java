package com.aco.my.restaurant.admin.desk.service.impl;

import com.aco.my.restaurant.admin.desk.dao.DeskDao;
import com.aco.my.restaurant.admin.desk.dao.RoomDao;
import com.aco.my.restaurant.admin.desk.dto.DeskDto;
import com.aco.my.restaurant.admin.desk.dto.RoomDto;
import com.aco.my.restaurant.admin.desk.service.RoomService;
import com.my.restaurant.domain.Desk;
import com.my.restaurant.domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomDao roomDao;
    @Autowired
    private DeskDao deskDao;

    @Override
    public List<Room> findByCondition1(Integer rtype) {
        return roomDao.findByCondition1(rtype);
    }

    @Override
    @Transactional
    public int insert(RoomDto roomDto) {
        int rid = saveRoom(roomDto);
       saveDesk(rid,roomDto.getDeskList());
        return rid;
    }
    //保存房间
    public int saveRoom(RoomDto roomDto){
        Room room = new Room();
        room.setRname(roomDto.getRname());
        room.setRtype(roomDto.getRtype());
        room.setRsize(roomDto.getRsize());
        room.setRstatue(roomDto.getRstatue());
        room.setDetails(roomDto.getDetails());
       roomDao.insert(room);
        return room.getRid();
    }
    //保存餐桌
    void saveDesk(Integer rid, List<Desk> deskList){
        for(Desk desk:deskList){
            desk.setFid(rid);
            deskDao.insert(desk);
        }
    }

}
