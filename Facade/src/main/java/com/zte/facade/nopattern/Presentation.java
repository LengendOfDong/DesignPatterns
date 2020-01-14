package com.zte.facade.nopattern;

/**
 * @author dadongge
 * @date 2019/5/1
 */
public class Presentation {
    public void generate(){
        //从配置管理中获取相应的配置信息
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenPresentation()){
            System.out.println("正在生成表现层代码文件");
        }
    }
}
