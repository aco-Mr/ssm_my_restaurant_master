package com.my.restaurant.account.service;

import com.my.restaurant.account.dto.OrderDto;

import java.util.List;

public interface OrderDtoService {

    public List<OrderDto> getOrderDto(Integer oid, Integer userId) throws Exception;
}
