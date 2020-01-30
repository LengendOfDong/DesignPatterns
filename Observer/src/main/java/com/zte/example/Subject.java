package com.zte.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadongge
 * @date 2020/1/27
 */
public class Subject {
    private List<Observer> readers = new ArrayList<Observer>();

    public void attach(Observer reader){
        readers.add(reader);
    }

    public void detach(Observer reader){
        readers.remove(reader);
    }

    protected void notifyObservers(){
        for(Observer reader: readers){
            reader.update(this);
        }
    }
}
