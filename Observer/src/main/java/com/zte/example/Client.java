package com.zte.example;

/**
 * 一份报纸被多个阅读者阅读
 * 当报纸出版时，负责通知所有注册的有效的阅读者
 * 每个阅读者都有一个更新状态的方法，当报纸出版时会调用
 * 阅读者更新状态，阅读者会回调报纸的状态，形成一个环路。
 * A调用B的方法，通知B去获取A的数据。
 * @author dadongge
 * @date 2020/1/27
 */
public class Client {
    public static void main(String[] args){
        Newspaper subject = new Newspaper();

        Reader reader1 = new Reader();
        reader1.setName("张三");

        Reader reader2 = new Reader();
        reader2.setName("李四");

        Reader reader3 = new Reader();
        reader3.setName("王五");

        subject.attach(reader1);
        subject.attach(reader2);
        subject.attach(reader3);

        subject.setContent("本期内容是观察者模式");
        //张三退订报纸
        subject.detach(reader1);

        subject.setContent("本期内容是代理模式");
    }
}
