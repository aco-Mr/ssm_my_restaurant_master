package com.aco.my.restaurant.account.web.controller;

import com.aco.my.restaurant.account.api.OrderApi;
import com.aco.my.restaurant.account.dto.OrderDto;
import com.aco.my.restaurant.account.service.OrderDtoService;
import com.my.restaurant.dto.BaseResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
@SessionAttributes(value = {"user","order"})
public class OrderController {
    @Autowired
    private OrderDtoService orderDtoService;

//    /**
//     * 结算
//     * @param oid 订单Id
//     * @return
//     */
//    @GetMapping("/getAccount")
//    public BaseResult account(Integer oid, ModelMap modelMap) throws Exception {
//        //通过获取Session获取用户Id
//        User user = modelMap.get("user");
//        List<OrderDto> list=null;
//        //判断
//        if(oid!=null&&user.getUid!=null){
//            list = orderDtoService.getOrderDto(oid, user.getUid);
//        }
//        //封装进baseResult里面
//        return BaseResult.success("成功",list);
//    }

    @RequestMapping("/judgePay")
    public int judgePay(ModelMap modelMap,Double money) throws Exception {
        System.out.println("sssssssss");
        //在Session中获取订单对象
        Object order = modelMap.get("order");
        OrderDto orderDto = new OrderDto();
        BeanUtils.copyProperties(order,orderDto);
        //获取Session中订单对象中的实际总价和折扣
        Double totalPrice = orderDto.getTotalPrice();
        Double discount = orderDto.getDiscount();
        //判断用户输入的价格是否给齐
        if(money!=null&&money==totalPrice*discount){
            return OrderApi.createOrder(orderDto.getOid(),1);
        }
        return 0;
    }

}
