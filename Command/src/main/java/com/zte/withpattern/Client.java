package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class Client {
    public static void main(String[] args){
        //把命令和真正的实现组合起来，相当于在组装机器
        //把机箱上按钮的连接线插接到主板上
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);
        ResetCommand resetCommand = new ResetCommand(mainBoard);
        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.setResetCommand(resetCommand);

        box.openButtonPressed();
        box.resetButtonPressed();

        System.out.println("-----------------------------------");

        MainBoardApi mainBoard1 = new WeixinMainBoard();
        OpenCommand openCommand1 = new OpenCommand(mainBoard1);
        ResetCommand resetCommand1 = new ResetCommand(mainBoard);

        Box box1 = new Box();
        box1.setOpenCommand(openCommand1);
        box1.setResetCommand(resetCommand1);
        box1.openButtonPressed();
        box1.resetButtonPressed();


    }
}
