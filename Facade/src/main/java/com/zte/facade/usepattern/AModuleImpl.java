package com.zte.facade.usepattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class AModuleImpl implements AModuleApi {
    @Override
    public void testA() {
        System.out.println("现在在模块A里面操作testA方法");
    }
}
