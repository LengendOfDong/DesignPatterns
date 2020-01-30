package com.zte.observer;

/**
 * @author dadongge
 * @date 2020/1/27
 */
public class ConcreteObserver implements Observer{
    private String observerState;

    @Override
    public void update(Subject subject) {
        observerState = ((ConcreteSubject)subject ).getSubjectState();
    }
}
