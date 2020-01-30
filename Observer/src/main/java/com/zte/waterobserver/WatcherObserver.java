package com.zte.waterobserver;

/**
 * @author dadongge
 * @date 2020/1/28
 */
public interface WatcherObserver {
    public void update(WaterQualitySubject subject);

    public void setJob(String job);

    public String getJob();
}
