package com.zte.facade.usepattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Facade {
    public void test(){
        AModuleApi a = new AModuleImpl();
        a.testA();
        BModuleApi b = new BModuleImpl();
        b.testB();
        CModuleApi c = new CModuleImpl();
        c.testC();
    }
}
