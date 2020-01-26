package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/1/25
 */
public class VideoCard extends Colleague {
    public VideoCard(Mediator mediator) {
        super(mediator);
    }

    public void showData(String data){
        System.out.println("您正观看的是：" + data);
    }

}
