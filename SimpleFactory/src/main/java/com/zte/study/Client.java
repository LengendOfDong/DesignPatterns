package com.zte.study;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Client {
    public static void main(String[] args){
        Api api = new Impl();
        api.test1("哈哈，不要紧张，只是一个测试而已！");
    }
}
