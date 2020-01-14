package com.zte.rewrite;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Client {
    public static void main(String[] args){
        Api api = Factory.create();
        api.test1("正在测试重写简单工厂。。。");
    }
}
