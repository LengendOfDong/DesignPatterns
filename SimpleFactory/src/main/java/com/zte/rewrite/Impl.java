package com.zte.rewrite;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Impl implements Api {
    @Override
    public void test1(String s) {
        System.out.println("Input a string,s == " + s);
    }
}
