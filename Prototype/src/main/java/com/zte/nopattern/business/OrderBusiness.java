package com.zte.nopattern.business;


import com.zte.nopattern.OrderApi;
import com.zte.nopattern.impl.EnterpriseOrder;
import com.zte.nopattern.impl.PersonalOrder;

/**
 * @author dadongge
 * @date 2020/1/20
 */
public class OrderBusiness {
    public void saveOrder(OrderApi order){
        while(order.getOrderProductNum() > 1000){
            OrderApi newOrder = null;

            if (order instanceof PersonalOrder){
                PersonalOrder p2 = new PersonalOrder();

                PersonalOrder p1 = (PersonalOrder)order;
                p2.setCustomerName(p1.getCustomerName());
                p2.setProductId(p1.getProductId());
                p2.setOrderProductNum(1000);
                newOrder = p2;
            }else if(order instanceof EnterpriseOrder){
                EnterpriseOrder e2 = new EnterpriseOrder();

                EnterpriseOrder e1 = (EnterpriseOrder)order;
                e2.setEnterpriseName(e1.getEnterpriseName());
                e2.setProductId(e1.getProductId());
                e2.setOrderProductNum(1000);
                newOrder = e2;
            }
            order.setOrderProductNum(order.getOrderProductNum() - 1000);
            System.out.println("拆分生成订单==" + newOrder);
        }
        System.out.println("订单==" + order);
    }
}
