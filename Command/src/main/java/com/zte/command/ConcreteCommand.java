package com.zte.command;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class ConcreteCommand implements Command{

    private Receiver receiver = null;

    private String state;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
