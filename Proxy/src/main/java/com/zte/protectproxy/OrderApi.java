package com.zte.protectproxy;

/**
 * @author dadongge
 * @date 2020/1/27
 */
public interface OrderApi {
    public String getProductName();

    public void setProductName(String productName, String user);

    public int getOrderNum();

    public void setOrderNum(int orderNum,String user);

    public String getOrderUser();

    public void setOrderUser(String orderUser, String user);

}
