package com.zte.rewrite;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Factory {
    public static Api create(){
        return new Impl();
    }
}
