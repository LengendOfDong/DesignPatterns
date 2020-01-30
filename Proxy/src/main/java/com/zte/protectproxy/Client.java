package com.zte.protectproxy;

/**
 * 代理OrderProxy在订单类Order外部包裹了一层
 * 代理重写方法，调用OrderApi方法时，会间接调用重写方法
 * java的静态代理
 * @author dadongge
 * @date 2020/1/27
 */
public class Client {
    public static void main(String[] args){
        OrderApi order = new OrderProxy(new Order("设计模式",100,"张三"));
        order.setOrderNum(123,"李四");
        System.out.println("李四修改后订单记录没有变化：" + order);
        order.setOrderNum(123,"张三");
        System.out.println("张三修改后，订单记录：" + order);
    }
}
