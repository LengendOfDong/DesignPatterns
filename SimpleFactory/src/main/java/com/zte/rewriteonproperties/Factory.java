package com.zte.rewriteonproperties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Factory {
    static Properties p = new Properties();
    static InputStream in = null;
    public static Api createApi(){
        in = Factory.class.getResourceAsStream("FactoryTest.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            System.out.println("装载工厂配置文件出错了，具体的堆栈信息如下：");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Api api = null;
        try {
            try {
                api = (Api)Class.forName(p.getProperty("ImplClass")).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
