package com.zte.simplefactory;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class ImplB implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplB s == "+ s);
    }
}
