package com.aco.my.restaurant.goods.service.impl;

import com.aco.my.restaurant.goods.service.GoodsService;
import com.aco.my.restaurant.goods.service.OperationService;
import com.aco.my.restaurant.goods.service.PriceService;
import com.aco.my.restaurant.goods.vo.GoodsVo;
import com.aco.my.restaurant.goods.vo.ResultGoods;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.restaurant.domain.Goods;
import com.my.restaurant.domain.Price;
import com.my.restaurant.utils.DateUtils;
import com.my.restaurant.utils.ResultSet;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional(rollbackFor = Exception.class)
public class OperationServiceImpl implements OperationService {
    @Resource
    private GoodsService goodsService;
    @Resource
    private PriceService priceService;

    /**
     * 添加菜单
     *
     * @param goodsVo
     * @return
     */
    @Override
    public ResultGoods<Integer> insertGoods(GoodsVo goodsVo) {
        //判断传进来的参数是否为空
        if (goodsVo.getGname() != null) {
            //判断菜品名字是否存在
            //获取Goods对象
            Goods goods = new GoodsVo();
            goods.setGname(goodsVo.getGname());
            List<Goods> list = goodsService.selectGoods(goods);
            //不存在
            if (list != null && list.size() == 0) {
                //获取当前时间
                String date = DateUtils.getDate();
                //先插入菜品,获取新增id
                //复制对象
                BeanUtils.copyProperties(goodsVo, goods);
                //给goods对象设置添加时间
                goods.setGaddtime(date);
                Integer rowsGoods = goodsService.insertGoods(goods);
                //获得gid
                int gid = goods.getGid();
                //再插入价格
                Price price = goodsVo.getPrice();
                //设置菜品价格修改时间
                price.setGid(gid);
                price.setPtime(date);
                int rowsPrice = priceService.insertPrice(price);
                return ResultGoods.setResult(ResultSet.SUCCESS_GOODSS, ResultSet.SUCCESS_GOODS, rowsPrice);
            }
            //存在
            else {
                return ResultGoods.setResult(ResultSet.FIND_GOODS_EXISTENCES, ResultSet.FIND_GOODS_EXISTENCE, 0);
            }

        }
        //参数为空
        else {
            return ResultGoods.setResult(ResultSet.OBJECT_ISNULLS, ResultSet.OBJECT_ISNULL, 0);
        }
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public ResultGoods<Map<String, Object>> selectAll(Integer pageNum, Integer pageSize) {
        //设置页码
        PageHelper.startPage(pageNum, pageSize);
        //获取分页对象
        //查询全部菜单
        List<Goods> goods = goodsService.selectGoods(new Goods());
        //创建分页对象
        PageInfo<Goods> pageInfo = new PageInfo<>(goods, 5);
        //存放GoodsVo集合
        List<GoodsVo> listGoodsVo = new ArrayList<>();
        //判断菜单是否存在
        if (goods != null && goods.size() > 0) {
            //根据菜单Id查询最新的价格并添加进list集合中
            goods.forEach(g -> {
                GoodsVo goodsVo = new GoodsVo();
                //复制Goods对象
                BeanUtils.copyProperties(g, goodsVo);
                //存入Price对象
                goodsVo.setPrice(priceService.selectByGoodsId(g.getGid()));
                listGoodsVo.add(goodsVo);
            });
            //保存分页数据和分页显示的数据
            Map<String, Object> map = new HashMap<>();
            map.put("pageInfo", pageInfo);
            map.put("listGoodsVo", listGoodsVo);
            //判断是否查询成功
            if (listGoodsVo != null && listGoodsVo.size() > 0) {
                return ResultGoods.setResult(ResultSet.GOODS_IS_FINDS, ResultSet.GOODS_IS_FIND, map);
            }
            //查询失败
            else {
                return ResultGoods.setResult(ResultSet.GOODS_NOT_FINDS, ResultSet.GOODS_NOT_FIND, map);
            }
        }
        //不存在
        else {
            return ResultGoods.setResult(ResultSet.GOODS_NOT_FINDS, ResultSet.GOODS_NOT_FIND, null);
        }
    }

    /**
     * 按照条件查询
     *
     * @param pageNum
     * @param pageSize
     * @param goodsVo
     * @return
     */
    @Override
    public ResultGoods<Map<String, Object>> selectCondition(Integer pageNum, Integer pageSize, GoodsVo goodsVo) {
        //设置页码
        PageHelper.startPage(pageNum, pageSize);
        //获取分页对象
        //查询全部菜单
        Goods gCondeiton = new Goods();
        //判断查询条件
        if (goodsVo.getGname() != null && !"".equals(goodsVo.getGname())) {//按照菜名查询
            gCondeiton.setGname(goodsVo.getGname());
        } else if (goodsVo.getGid() != null) {//按照菜品编号查询
            gCondeiton.setGid(goodsVo.getGid());
        } else {//按照菜品类型查询
            gCondeiton.setGtype(goodsVo.getGtype());
        }
//        System.out.println("goods："+gCondeiton);
        List<Goods> goods = goodsService.selectGoods(gCondeiton);
        //创建分页对象
        PageInfo<Goods> pageInfo = new PageInfo<>(goods, 5);
        //存放GoodsVo集合
        List<GoodsVo> listGoodsVo = new ArrayList<>();
        //判断菜单是否存在
        if (goods != null && goods.size() > 0) {
            //根据菜单Id查询最新的价格并添加进list集合中
            goods.forEach(g -> {
                GoodsVo goodsVos = new GoodsVo();
                //复制Goods对象
                BeanUtils.copyProperties(g, goodsVos);
                //存入Price对象
                goodsVos.setPrice(priceService.selectByGoodsId(g.getGid()));
                listGoodsVo.add(goodsVos);
            });
            //保存分页数据和分页显示的数据
            Map<String, Object> map = new HashMap<>();
            map.put("pageInfo", pageInfo);
            map.put("listGoodsVo", listGoodsVo);
            //判断是否查询成功
            if (listGoodsVo != null && listGoodsVo.size() > 0) {
                return ResultGoods.setResult(ResultSet.GOODS_IS_FINDS, ResultSet.GOODS_IS_FIND, map);
            }
            //查询失败
            else {
                return ResultGoods.setResult(ResultSet.GOODS_IS_NOTS, ResultSet.GOODS_IS_NOT, null);
            }
        }
        //不存在
        else {
            return ResultGoods.setResult(ResultSet.GOODS_IS_NOTS, ResultSet.GOODS_IS_NOT, null);
        }
    }

    /**
     * 按照条件进行删除
     *
     * @param listGoods
     * @return
     */
    @Override
    public ResultGoods<Integer> delGoods(List<GoodsVo> listGoods) {
        int row = 0;
        //判断传进来的list集合是否为空
        if (listGoods != null && listGoods.size() > 0) {
            //遍历listGoods集合
            for (GoodsVo g : listGoods) {
                row = goodsService.delGoods(g.getGid());
            }
            //返回结果
            return ResultGoods.setResult(ResultSet.GOODS_IS_DELS, ResultSet.GOODS_IS_DEL, row);
        }
        //集合为空
        else {
            return ResultGoods.setResult(ResultSet.GOODS_NOT_DELS, ResultSet.GOODS_NOT_DEL, row);
        }
    }

    /**
     * 修改菜品信息
     *
     * @param goodsVo
     * @return
     */
    @Override
    public ResultGoods<Integer> updateGoods(GoodsVo goodsVo) {
        //先判断修改价格还是修改菜品主信息
        //修改菜品主体信息
        //创建菜品对象
        Goods goods = new Goods();
        if (goodsVo != null) {
            //1.判断修改的菜品名称是否存在
            goods.setGname(goodsVo.getGname());
            List<Goods> goods1 = goodsService.selectGoods(goods);
            goods1.forEach(s -> System.out.println("s:" + goods1));
            //菜品名称不存在,如果菜品名称不存在则将数据库中的所有菜品查询出来,或者为null
            if (goods1.size()>0||goods1 == null) {
                //2.设置gid，根据gid去修改信息
                //获得gid
                goods.setGid(goodsVo.getGid());
                BeanUtils.copyProperties(goodsVo, goods);
                System.out.println("goods:" + goods);
                //接收返回结果
                int rows = 0;
                //当goods不为空时才修改
                if (goods.getGname() != null || goods.getGdetails() != null || goods.getGimag() != null || goods.getGstate() != null || goods.getGtype() != null) {
                    //3.修改信息
                    rows = goodsService.updateGood(goods);
                }
                //判断是否需要修改价格
                if (goodsVo.getPrice() != null) {
                    //获得当前时间
                    String date = DateUtils.getDate();
                    //查询
                    Price price = priceService.selectByGoodsId(goods.getGid());
                    //判断修改的价格是否存在
                    System.out.println("price:"+price.getPrice());
                    if(goodsVo.getPrice().getPrice()!=null&&!price.getPrice().equals(goodsVo.getPrice().getPrice())){
                        //设置gid
                        price.setGid(goods.getGid());
                        //插入价格
                        price.setPrice(goodsVo.getPrice().getPrice());
                        price.setPtime(date);
                        rows = priceService.insertPrice(price);
                        System.out.println("row:"+rows);
                        //判断是否修改成功
                        if (rows > 0) {
                            return ResultGoods.setResult(ResultSet.GOODS_IS_UPDATES, ResultSet.GOODS_IS_UPDATE, rows);
                        }
                        //修改失败
                        else {
                            return ResultGoods.setResult(ResultSet.GOODS_NOT_UPDATES, ResultSet.GOODS_NOT_UPDATE, 0);
                        }
                    }
                    //价格存在
                    else{
                        return ResultGoods.setResult(ResultSet.GOODS_IS_UPDATES, ResultSet.GOODS_IS_UPDATE, rows);
                    }

                }
                //4.判断是否修改成功
                if (rows > 0) {
                    return ResultGoods.setResult(ResultSet.GOODS_IS_UPDATES, ResultSet.GOODS_IS_UPDATE, rows);
                }
                //修改失败
                else {
                    return ResultGoods.setResult(ResultSet.GOODS_NOT_UPDATES, ResultSet.GOODS_NOT_UPDATE, 0);
                }
            }
            //菜品名称存在
            else {
                return ResultGoods.setResult(ResultSet.FIND_GOODS_EXISTENCES, ResultSet.FIND_GOODS_EXISTENCE, 0);
            }
        }
        //goodsVo为null
        else {
            return ResultGoods.setResult(ResultSet.GOODS_NOT_UPDATES, ResultSet.GOODS_NOT_DEL, 0);
        }
    }
}
