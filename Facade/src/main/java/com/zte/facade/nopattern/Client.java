package com.zte.facade.nopattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Client {
    public static void main(String[] args){
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
