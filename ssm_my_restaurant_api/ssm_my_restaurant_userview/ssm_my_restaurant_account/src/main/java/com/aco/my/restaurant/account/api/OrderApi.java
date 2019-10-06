package com.aco.my.restaurant.account.api;

import com.aco.my.restaurant.account.dto.OrderDto;
import com.my.restaurant.utils.HttpClientUtils;
import com.my.restaurant.utils.MapperUtils;
import org.apache.http.message.BasicNameValuePair;

import java.util.List;

public class OrderApi {
    /**
     * 获取orderDto对象
     * @param oid
     * @param userId
     * @return
     * @throws Exception
     */
    public static List<OrderDto> getOrder(Integer oid, Integer userId) throws Exception {
        //创建url
        String url = "http://10.3.144.84:8080/ssm_my_restaurant_admin_order/order/getOrder";
        BasicNameValuePair basicNameValuePair[] = {
                new BasicNameValuePair("oid",oid.toString()),
                new BasicNameValuePair("userId",userId.toString())};
        //获得响应对象
        String json = HttpClientUtils.doPost(url,basicNameValuePair);
        List<OrderDto> dateList = MapperUtils.json2listByTree(json, "data", OrderDto.class);
        return dateList;
    }

    /**
     * 修改是否支付
     * @param oid
     * @param isPay
     * @return
     */
    public static int createOrder(Integer oid,Integer isPay){
        //创建url
        String url = "http://10.3.144.84:8080/ssm_my_restaurant_admin_order/order/update";
        //获得Json
        BasicNameValuePair basicNameValuePair[] = {
                new BasicNameValuePair("oid",oid.toString()),
                new BasicNameValuePair("isPay",isPay.toString())};
        String json = HttpClientUtils.doPost(url, basicNameValuePair);
        System.out.println("json:"+json);
        Integer integer = MapperUtils.obj2pojo(json, int.class);
        return integer;
    }
}
