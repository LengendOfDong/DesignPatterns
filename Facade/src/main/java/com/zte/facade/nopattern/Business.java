package com.zte.facade.nopattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Business {
    public void generate(){
        //从配置管理中获取相应的配置信息
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenBusiness()){
            System.out.println("正在生成逻辑层代码文件");
        }
    }
}
