package com.aco.my.restaurant.admin.order.dto;

import com.my.restaurant.domain.*;


public class OrderDto extends Order {
    private Goods goods;
    private Orderandgoods orderandgoods;
    private Price price;
    private  Room room;
    private  User user;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Orderandgoods getOrderandgoods() {
        return orderandgoods;
    }

    public void setOrderandgoods(Orderandgoods orderandgoods) {
        this.orderandgoods = orderandgoods;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
