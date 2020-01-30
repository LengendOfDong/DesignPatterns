package com.zte.waterobserver;

/**
 * @author dadongge
 * @date 2020/1/28
 */
public class WaterQuality extends WaterQualitySubject{

    private int polluteLevel = 0;


    @Override
    public void notifyWatchers() {
        for(WatcherObserver watcher:observers){
            if(this.polluteLevel >= 0){
                //通知监测员做记录
                if("监测人员".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
            if(this.polluteLevel >= 1){
                //通知预警人员
                if("预警人员".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
            if(this.polluteLevel >= 2){
                if("监测部门领导".equals(watcher.getJob())){
                    watcher.update(this);
                }
            }
        }
    }

    @Override
    public int getPolluteLevel() {
        return polluteLevel;
    }

    public void setPolluteLevel(int polluteLevel){
        this.polluteLevel = polluteLevel;
        this.notifyWatchers();
    }
}
