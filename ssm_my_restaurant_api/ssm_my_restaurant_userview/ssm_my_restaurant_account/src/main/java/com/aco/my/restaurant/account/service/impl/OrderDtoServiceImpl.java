package com.aco.my.restaurant.account.service.impl;

import com.aco.my.restaurant.account.api.OrderApi;
import com.aco.my.restaurant.account.dto.OrderDto;
import com.aco.my.restaurant.account.service.OrderDtoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDtoServiceImpl implements OrderDtoService {
    @Override
    public List<OrderDto> getOrderDto(Integer oid, Integer userId) throws Exception {
        return OrderApi.getOrder(oid,userId);
    }
}
