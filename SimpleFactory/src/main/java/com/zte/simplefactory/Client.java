package com.zte.simplefactory;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Client {
    public static void main(String[] args){
        Api api = Factory.create(1);
        api.operation("正在使用简单工厂");
    }
}
