package com.zte.deepclone.api;

/**
 * @author dadongge
 * @date 2020/1/16
 */
public interface OrderApi {

    public int getOrderProductNum();

    public void setOrderProductNum(int num);

    public OrderApi cloneOrder();
}
