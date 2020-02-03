package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class Box {
    private Command openCommand;

    private Command resetCommand;

    public void setResetCommand(Command command){
        this.resetCommand = command;
    }

    public void setOpenCommand(Command command){
        this.openCommand = command;
    }

    public void openButtonPressed(){
        openCommand.execute();
    }

    public void resetButtonPressed(){
        resetCommand.execute();
    }
}
