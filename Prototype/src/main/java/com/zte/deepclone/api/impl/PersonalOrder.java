package com.zte.deepclone.api.impl;

import com.zte.deepclone.api.OrderApi;
import com.zte.deepclone.impl.Product;

/**
 * @author dadongge
 * @date 2020/1/16
 */
public class PersonalOrder implements OrderApi{
    private String customerName;

    private int orderProductNum = 0;

    private Product product = null;
    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "订购产品是="+this.product.getName()+",订购数量为=" + this.orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        //创建一个新的订单，然后把本实例数据复制过去
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.customerName);
        order.setOrderProductNum(this.orderProductNum);
        //对于对象类型的数据，深度克隆的时候需要继续调用这个对象的克隆方法
        order.setProduct((Product)this.product.cloneProduct());
        return order;
    }
}
