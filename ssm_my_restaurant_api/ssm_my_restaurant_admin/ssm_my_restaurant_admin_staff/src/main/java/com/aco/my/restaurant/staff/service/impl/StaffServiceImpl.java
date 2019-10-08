package com.aco.my.restaurant.staff.service.impl;

import com.aco.my.restaurant.staff.dao.StaffDao;
import com.aco.my.restaurant.staff.service.StaffService;
import com.my.restaurant.domain.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: StaffServiceImpl
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/24 15:37
 * @Version: 1.0.0
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffDao staffDao;

    @Override
    public Staff findById(int sid) {
        return staffDao.findById(sid);
    }

    @Override
    public List<Staff> findByCondition1(Staff staff) {
        return staffDao.findByCondition1(staff);
    }

    @Override
    public int inserstaff(Staff staff) {
        return staffDao.inserstaff(staff);
    }

    @Override
    public List<Staff> findByCondition2(Staff staff) {
        return staffDao.findByCondition2(staff);
    }

    @Override
    public int updateStaff(Staff staff) {
        return staffDao.updateStaff(staff);
    }

    @Override
    public int quitStaff(Staff staff) {
        return staffDao.quitStaff(staff);
    }
}
