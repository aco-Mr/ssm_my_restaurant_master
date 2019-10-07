package com.aco.my.restaurant.classify.web.controller;

import com.aco.my.restaurant.classify.dto.ClassifyDto;
import com.aco.my.restaurant.classify.service.ClassifyService;
import com.my.restaurant.domain.Classify;
import com.my.restaurant.dto.BaseResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Controller
@RequestMapping("/classify")
public class ClassifyController {
    static int nums=0;
    @Autowired
    private ClassifyService classifyService;

    @GetMapping("/findByCondition")
    @ResponseBody
    public BaseResult findNums(Integer condition) {
        Date nowDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(nowDate);
        System.out.println("date:" + date);
        //创建map
        Map<String, Object> map = new HashMap<>();
        map.put("date", date);
        map.put("condition", condition);
        System.out.println("date1:" + map.get("date"));
        List<Classify> classify = classifyService.findDate(map);
        classify.forEach(s -> System.out.println("classify:" + s));
        //创建存放ClassifyDto的list集合
        List<ClassifyDto> classifyList = new ArrayList<>();
        copyList(classify, classifyList);
        return BaseResult.success("成功", classifyList);
    }

    @GetMapping("/findAll")
    @ResponseBody
    public BaseResult findAll() {
        List<Classify> classify = classifyService.getAll();
        //创建ClassifyDto对象
        List<ClassifyDto> classifyList = new ArrayList<>();
        copyList(classify, classifyList);
        return BaseResult.success("成功", classifyList);
    }

    @PostMapping
    public int addClassify(Classify classify) {
        //获取当前时间
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String dateFormat = df.format(date);
        //设置时间
        classify.setDate(dateFormat);
        //设置号码
        classify.setCid(++nums);
        System.out.println("classify:" + classify);
        int rows = classifyService.addClassify(classify);
        System.out.println("rows:" + rows);
        return rows;
    }

    @PutMapping
    public int createClassify(Classify classify) {
        int rows = classifyService.addClassify(classify);
        System.out.println("rows:"+rows);
        return rows;
    }

    private void copyList(List<Classify> classify, List<ClassifyDto> classifyList) {
        for (Classify c : classify) {
            //创建ClassifyDto对象
            ClassifyDto classifyDto = new ClassifyDto();
            BeanUtils.copyProperties(c, classifyDto);
            classifyList.add(classifyDto);
        }
    }
}
