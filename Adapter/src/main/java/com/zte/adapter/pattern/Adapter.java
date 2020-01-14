package com.zte.adapter.pattern;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request(){
        adaptee.specificRequest();
    }
}
