package com.zte.facade.usepattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class CModuleImpl implements CModuleApi {
    @Override
    public void testC() {
        System.out.println("现在在模块C里面操作testC方法");
    }
}
