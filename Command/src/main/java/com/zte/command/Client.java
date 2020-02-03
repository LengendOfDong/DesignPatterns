package com.zte.command;

/**
 * 这个命令模式可以理解成开发商将工程包给工头，开发商就是Client,包工头就是Invoker
 * 包工头将工程指令给分配成多个指令，比如建楼房，修花园等工程
 * 具体的指令就是ConcreteCommand,命令设计成接口方便扩展
 * 下面的工人就是receiver，来执行具体的操作，例如设计图纸，搬运材料，灌注水泥，搭建楼房等
 * 一个命令可以有多个Receiver，来执行不同的操作。
 * @author dadongge
 * @date 2020/2/3
 */
public class Client {
    public void assemble(){
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.runCommand();
    }
}
