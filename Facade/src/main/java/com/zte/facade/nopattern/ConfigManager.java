package com.zte.facade.nopattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class ConfigManager {
    private static ConfigManager manager = null;
    private static ConfigModel cm = null;

    private ConfigManager(){

    }

    public static ConfigManager getInstance(){
        if( manager == null){
            manager = new ConfigManager();
            cm = new ConfigModel();
        }
        return manager;
    }

    public ConfigModel getConfigData(){
        return cm;
    }
}
