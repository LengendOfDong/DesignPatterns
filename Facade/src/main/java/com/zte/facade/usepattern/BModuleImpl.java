package com.zte.facade.usepattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class BModuleImpl implements BModuleApi {
    @Override
    public void testB() {
        System.out.println("现在在模块B里面操作testB方法");
    }
}
