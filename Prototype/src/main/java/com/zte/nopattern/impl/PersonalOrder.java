package com.zte.nopattern.impl;

import com.zte.nopattern.OrderApi;

/**
 * @author dadongge
 * @date 2020/1/20
 */
public class PersonalOrder implements OrderApi{

    private String customerName;

    private String productId;

    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public String toString() {
        return "本个人订单的订购人是=" + this.customerName + ".订购产品是=" + this.productId +",订购数量为="+this.orderProductNum;
    }
}
