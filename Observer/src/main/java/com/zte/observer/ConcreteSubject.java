package com.zte.observer;

/**
 * @author dadongge
 * @date 2020/1/27
 */
public class ConcreteSubject extends Subject{

    private String subjectState;

    public String getSubjectState(){
        return subjectState;
    }

    public void setSubjectState(String subjectState){
        this.subjectState = subjectState;
        this.notifyObservers();
    }
}
