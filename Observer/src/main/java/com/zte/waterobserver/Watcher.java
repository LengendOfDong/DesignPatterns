package com.zte.waterobserver;

/**
 * @author dadongge
 * @date 2020/1/28
 */
public class Watcher implements WatcherObserver{
    private String job;

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void update(WaterQualitySubject subject){
        System.out.println(job + "获取到通知，当前污染级别为：" + subject.getPolluteLevel());
    }
}
