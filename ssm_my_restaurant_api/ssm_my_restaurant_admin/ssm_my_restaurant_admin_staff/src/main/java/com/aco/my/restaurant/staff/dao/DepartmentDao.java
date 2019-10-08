package com.aco.my.restaurant.staff.dao;

import com.my.restaurant.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: DepartmentDao
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/25 23:17
 * @Version: 1.0.0
 */
@Repository
public interface DepartmentDao {
    public List<Department> findByAll();
}
