package com.zte.study;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Impl implements  Api{


    @Override
    public void test1(String s) {
        System.out.println("Now In Impl. The input s == " + s);
    }
}
