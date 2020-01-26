package com.zte.withpattern;



/**
 * @author dadongge
 * @date 2020/1/25
 */
public class CDDriver extends Colleague{
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    private String data = "";

    public String getData(){
        return this.data;
    }

    public void readCD(){
        this.data = "设计模式，值得好好研究";
        this.getMediator().changed(this);
    }
}
