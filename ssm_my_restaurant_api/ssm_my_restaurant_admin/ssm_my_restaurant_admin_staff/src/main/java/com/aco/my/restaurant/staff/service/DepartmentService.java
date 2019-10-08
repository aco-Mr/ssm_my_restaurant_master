package com.aco.my.restaurant.staff.service;

import com.my.restaurant.domain.Department;

import java.util.List;

/**
 * @ClassName: DepartmentService
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/26 19:50
 * @Version: 1.0.0
 */
public interface DepartmentService {
    public List<Department> findByAll();
}
