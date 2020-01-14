package com.zte.adapter.pattern;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public class Client {
    public static void main(String[] args){
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
