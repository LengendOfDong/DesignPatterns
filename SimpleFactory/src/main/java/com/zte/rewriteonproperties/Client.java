package com.zte.rewriteonproperties;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Client {
    public static void main(String[] args){
        Api api = Factory.createApi();
        api.test1("哈哈哈，不要紧张，测试而已！");
    }
}
