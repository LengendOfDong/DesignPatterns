package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/1/20
 */
public interface OrderApi {
    public int getOrderProductNum();

    public void setOrderProductNum(int num);

    public OrderApi cloneOrder();
}
