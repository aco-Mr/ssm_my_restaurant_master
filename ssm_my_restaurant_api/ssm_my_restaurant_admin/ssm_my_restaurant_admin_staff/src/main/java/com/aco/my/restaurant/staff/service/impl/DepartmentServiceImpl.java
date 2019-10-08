package com.aco.my.restaurant.staff.service.impl;

import com.aco.my.restaurant.staff.dao.DepartmentDao;
import com.aco.my.restaurant.staff.service.DepartmentService;
import com.my.restaurant.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DepartmentServiceImpl
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/26 19:51
 * @Version: 1.0.0
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<Department> findByAll() {
        return departmentDao.findByAll();
    }
}
