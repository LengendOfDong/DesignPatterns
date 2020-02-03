package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class OpenCommand implements Command{
    private MainBoardApi mainBoard = null;

    public OpenCommand(MainBoardApi mainBoard){
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        this.mainBoard.open();
    }
}
