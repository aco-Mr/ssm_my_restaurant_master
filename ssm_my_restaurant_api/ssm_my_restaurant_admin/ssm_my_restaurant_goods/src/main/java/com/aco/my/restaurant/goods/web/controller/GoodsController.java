package com.aco.my.restaurant.goods.web.controller;

import com.aco.my.restaurant.goods.service.OperationService;
import com.aco.my.restaurant.goods.vo.GoodsVo;
import com.aco.my.restaurant.goods.vo.ResultGoods;
import com.my.restaurant.domain.Goods;
import com.my.restaurant.utils.MapperUtils;
import org.apache.commons.io.IOUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private OperationService operationService;

    /**
     * 单独查询
     * @param condition
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/findGoods")
    public ResultGoods<Map<String, Object>> findGoods(String condition, Integer pageNum,Integer pageSize){
        //判断传进来的条件是什么类型
        GoodsVo goodsVo = new GoodsVo();
        ResultGoods<Map<String, Object>> mapResultGoods = null;
        try {
            //按菜品编号查询
            int id = Integer.parseInt(condition);
            goodsVo.setGid(Integer.valueOf(condition));
            mapResultGoods = operationService.selectCondition(pageNum, pageSize, goodsVo);
        } catch (NumberFormatException e) {
            //按名字查询
            goodsVo.setGname(condition);
            mapResultGoods = operationService.selectCondition(pageNum, pageSize, goodsVo);
            //第一次查询失败
            if(mapResultGoods.getData()==null){
                //按类型查询
                goodsVo.setGname(null);
                goodsVo.setGtype(condition);
                mapResultGoods = operationService.selectCondition(pageNum,pageSize,goodsVo);
            }
        }
        return mapResultGoods;
    }

    /**
     * 添加菜品
     * @param goodsVo
     * @return
     */
    @PostMapping("/add")
    public ResultGoods<Integer> insertGoods(@RequestBody GoodsVo goodsVo){
        ResultGoods<Integer> resultGoods = operationService.insertGoods(goodsVo);
        return resultGoods;
    }

    /**
     * 查询全部菜品
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/all",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public ResultGoods<Map<String,Object>> findAll(Integer pageNum,Integer pageSize){
        ResultGoods<Map<String, Object>> map = operationService.selectAll(pageNum, pageSize);
        return map;
    }

    /**
     *  修改菜品
     * @param goodsVo
     */
    @PostMapping("/update")
    @ResponseBody
    public ResultGoods<Integer> updateGood(@RequestBody GoodsVo goodsVo) {
        System.out.println();
        ResultGoods<Integer> result = operationService.updateGoods(goodsVo);
        System.out.println("haha:"+result.getMsg());
        return result;
    }

    /**
     * 删除菜品
     */
    @PostMapping("/del")
    public ResultGoods<Integer> delGoods(Integer[] listGid) throws Exception {
        System.out.println("gid:"+listGid[0]);
        //创建集合
        List<GoodsVo> listGoodsVo = new ArrayList<>();
        //循环赋值
        for (int i = 0;i < listGid.length;i++){
            GoodsVo goodsVo = new GoodsVo();
            goodsVo.setGid(listGid[i]);
            listGoodsVo.add(goodsVo);
        }
        for(Integer i:listGid){
            System.out.println("gid:"+i);
        }
        ResultGoods<Integer> result = operationService.delGoods(listGoodsVo);
        return result;
    }

    /**
     * 上传图片
     * @param uploads
     * @param request
     * @return
     */
    @PostMapping(value = "/upload",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Map<String,Object> uploadImag(@RequestParam("uploads") MultipartFile[] uploads
            , HttpServletRequest request){
        // 用于保存上传的文件列表
        List<String> fileNameList = new ArrayList<>();
        // 1、获得上传文件的目录
//        String rootPath = request.getSession().getServletContext().getRealPath("").toString()+"suggestionPic\\";
        String rootPath = "E:\\MavenProject\\ssm_my_restaurant_master\\ssm_my_restaurant_ui\\src\\main\\webapp\\static\\js\\bootstrap\\img\\goods\\upload";
        System.out.println("rootPath:"+rootPath);
        // 2、验证根目录是否存在，不存在就创建
        File parentFile = new File(rootPath);
        if(!parentFile.exists()) parentFile.mkdirs();

        // 3、上传文件
        if(uploads!=null && uploads.length>0){
            for(MultipartFile file:uploads){
                if(!file.isEmpty()){//如果文件不为空
                    // 3.1、获得上传文件要保存的文件对象
                    //将文件后缀为.bmp替换成jpg格式
                    String fileName = file.getOriginalFilename();
                    if(file.getOriginalFilename().contains(".bmp")){
                        fileName = file.getOriginalFilename().replace(".bmp",".jpg");
                    }
                    File newFile = new File(parentFile,fileName);
                    // 3.2、开始读写文件
                    try(
                            InputStream is = file.getInputStream();
                            OutputStream os = new FileOutputStream(newFile)
                    ){
                        IOUtils.copy(is,os);// 文件拷贝
                        fileNameList.add("/upload/"+fileName);//文件名添加到集合中
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }
        Map<String,Object> map = new HashMap<>();
        map.put("fileNameList",fileNameList);
        return map;
    }
}
