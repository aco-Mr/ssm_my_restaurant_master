package com.aco.my.restaurant.goods.vo;

import com.my.restaurant.domain.Goods;
import com.my.restaurant.domain.Price;
import lombok.Data;

@Data
public class GoodsVo extends Goods {
    private Price price;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodsVo{" +
                "price=" + price +
                '}';
    }
}
