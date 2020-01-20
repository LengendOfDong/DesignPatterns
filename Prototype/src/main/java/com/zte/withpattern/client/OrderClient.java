package com.zte.withpattern.client;

import com.zte.withpattern.business.OrderBusiness;
import com.zte.withpattern.impl.EnterpriseOrder;
import com.zte.withpattern.impl.PersonalOrder;

/**
 * @author dadongge
 * @date 2020/1/20
 */
public class OrderClient {
    public static void main(String[] args){
        PersonalOrder op = new PersonalOrder();

        op.setOrderProductNum(2925);
        op.setCustomerName("张三");
        op.setProductId("P0001");

        OrderBusiness ob = new OrderBusiness();
        ob.saveOrder(op);

        EnterpriseOrder ep = new EnterpriseOrder();

        ep.setOrderProductNum(2925);
        ep.setEnterpriseName("哈哈股份有限公司");
        ep.setProductId("E0001");

        OrderBusiness ob1 = new OrderBusiness();
        ob1.saveOrder(ep);
    }
}
