package com.zte.simplefactory;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class ImplA implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplA s == " + s);
    }
}
