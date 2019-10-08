package com.aco.my.restaurant.staff.web.controller;

import com.aco.my.restaurant.staff.service.DepartmentService;
import com.aco.my.restaurant.staff.service.StaffService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.restaurant.domain.Department;
import com.my.restaurant.domain.Staff;
import com.my.restaurant.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: StaffController
 * @Description: TODO
 * @Author: ww
 * @Date: 2019/9/24 15:41
 * @Version: 1.0.0
 */
@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @Autowired
    private DepartmentService departmentService;


    //输出员工信息
    @PostMapping("/list")
    public PageInfo<Staff> list(String stu,Integer pageNum,Integer pageSize) throws Exception {
        Staff staff = MapperUtils.json2pojo(stu,Staff.class);
        PageHelper.startPage(pageNum,pageSize);
        System.out.println(stu);
        List<Staff> list = staffService.findByCondition2(staff);
        list.forEach(s-> System.out.println(s));
        PageInfo<Staff> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }


    //传部门的值到添加员工页面
    @PostMapping("/department")
    public List<Department> list (){
        List<Department> list = departmentService.findByAll();
        return list;
    }


    //添加员工
    @PostMapping("/addstaff")
    public void list2(String stu) throws Exception {
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Staff staff = MapperUtils.json2pojo(stu,Staff.class);
        //入职时间
        staff.setShiredate(df.format(new Date()));
        //员工状态
        staff.setState(1);
        int inserstaffs = staffService.inserstaff(staff);
        System.out.println(inserstaffs);
    }

    //返回信息回页面
    @PostMapping("/backstaff")
    public List<Staff> list(Integer sid){
        Staff staff = new Staff();
        staff.setSid(sid);
        List<Staff> list = staffService.findByCondition2(staff);
        System.out.println("------------------");
        System.out.println(list);
        System.out.println("------------------");
        return list;
    }

    //修改员工信息
    @PostMapping("/updastaff")
    public void list3(String stu) throws Exception {
        Staff staff = MapperUtils.json2pojo(stu,Staff.class);
        System.out.println(staff);
        System.out.println("-------------------------");
        int i = staffService.updateStaff(staff);
        System.out.println(i);
    }

    @PostMapping("/quit")
    public void list4(Integer sid,String state){
        System.out.println(state);
        if (state.equals("离职")){
            Staff staff= staffService.findById(sid);
            staff.setExitDate(null);
            staff.setState(1);
            staffService.quitStaff(staff);
            int row = staffService.quitStaff(staff);
            if (row>0){
                System.out.println("在职成功");
            }
        }else if (state.equals("在职")){
            Staff staff = staffService.findById(sid);
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            staff.setExitDate(df.format(new Date()));
            staff.setState(2);
            int row = staffService.quitStaff(staff);
            if (row>0){
                System.out.println("离职成功");
            }
        }
    }
}
