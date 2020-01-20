package com.zte.withpattern.business;

import com.zte.withpattern.OrderApi;

/**
 * @author dadongge
 * @date 2020/1/20
 */
public class OrderBusiness {
   public void saveOrder(OrderApi order){
       while(order.getOrderProductNum() > 1000){
           OrderApi newOrder = order.cloneOrder();

           newOrder.setOrderProductNum(1000);

           order.setOrderProductNum(order.getOrderProductNum() - 1000);

           System.out.println("拆分生成订单 == " + newOrder);


       }

       System.out.println("订单 == " + order);
   }
}
