package com.zte.packageCommand;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class HotCook implements CookApi{
    @Override
    public void cook(String name) {
        System.out.println("本厨师正在做：" + name);
    }
}
