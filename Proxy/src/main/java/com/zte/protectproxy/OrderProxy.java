package com.zte.protectproxy;

/**
 * @author dadongge
 * @date 2020/1/27
 */
public class OrderProxy implements OrderApi{
    private Order order = null;

    public OrderProxy(Order realSubject){
        this.order = realSubject;
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        if(user!= null && user.equals(this.getOrderUser())){
            order.setProductName(productName, user);
        }else{
            System.out.println("对不起" + user + ",您无权修改订单中的产品名称");
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if(user!=null && user.equals(this.getOrderUser())){
            order.setOrderNum(orderNum, user);
        }else{
            System.out.println("对不起" + user + ",您无权修改订单中的订购数量。");
        }
    }

    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if(user!=null && user.equals(this.getOrderUser())){
            order.setOrderUser(orderUser, user);
        }else{
            System.out.println("对不起" + user + "，您无权修改订单中的订购人");
        }
    }

    @Override
    public String toString(){
        return "productName = " + this.getProductName() + ",orderNum="
                + this.getOrderNum() + ",orderUser=" + this.getOrderUser();
    }
}
