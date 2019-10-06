package com.aco.my.restaurant.account.service;

import com.aco.my.restaurant.account.dto.OrderDto;

import java.util.List;

public interface OrderDtoService {

    public List<OrderDto> getOrderDto(Integer oid, Integer userId) throws Exception;
}
