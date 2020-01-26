package com.zte.withpattern;

/**
 * @author dadongge
 * @date 2020/1/25
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator(){
        return mediator;
    }
}
