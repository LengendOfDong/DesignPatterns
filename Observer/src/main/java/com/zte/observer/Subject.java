package com.zte.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadongge
 * @date 2020/1/27
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    protected  void notifyObservers(){
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}
