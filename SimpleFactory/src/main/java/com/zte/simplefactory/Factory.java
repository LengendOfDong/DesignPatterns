package com.zte.simplefactory;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Factory {
    public static Api create(int condition){
        Api api = null;
        if(condition == 1){
            api = new ImplA();

        }else if(condition == 2){
            api = new ImplB();
        }
        return api;
    }
}
