package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class ResetCommand implements Command{
    private MainBoardApi mainBoard;

    public ResetCommand(MainBoardApi mainBoard){
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        mainBoard.reset();
    }
}
