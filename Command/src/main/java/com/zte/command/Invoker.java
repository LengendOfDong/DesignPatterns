package com.zte.command;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class Invoker {
    private Command command = null;

    public void setCommand(Command command){
        this.command = command;
    }

    public void runCommand(){
        command.execute();
    }
}
