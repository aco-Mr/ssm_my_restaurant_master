package com.aco.my.restaurant.staff.dao;

import com.my.restaurant.domain.Staff;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: StaffDao
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/24 15:12
 * @Version: 1.0.0
 */
@Repository
public interface StaffDao {
    public Staff findById(int sid);

    public List<Staff> findByCondition1(Staff staff);

    public int inserstaff(Staff staff);

    public List<Staff> findByCondition2(Staff staff);

    public int  updateStaff(Staff staff);

    public int quitStaff(Staff staff);

}
