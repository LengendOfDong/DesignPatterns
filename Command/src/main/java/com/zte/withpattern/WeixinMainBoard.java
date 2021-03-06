package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/2/3
 */
public class WeixinMainBoard implements MainBoardApi {
    @Override
    public void open() {
        System.out.println("微星主板现在正在开机，请稍后");
        System.out.println("接通电源....");
        System.out.println("设备检查...");
        System.out.println("装载系统...");
        System.out.println("机器正常运转起来...");
        System.out.println("机器已经正常打开，请操作");
    }

    @Override
    public void reset() {
        System.out.println("微星主板正在重置，请稍后");
    }
}
