package com.aco.my.restaurant.staff.service;

import com.my.restaurant.domain.Staff;

import java.util.List;

/**
 * @ClassName: StaffService
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/24 15:37
 * @Version: 1.0.0
 */
public interface StaffService {
    public Staff findById(int sid);

    public List<Staff> findByCondition1(Staff staff);

    public int inserstaff(Staff staff);

    public List<Staff> findByCondition2(Staff staff);

    public int  updateStaff(Staff staff);

    public int quitStaff(Staff staff);

}
