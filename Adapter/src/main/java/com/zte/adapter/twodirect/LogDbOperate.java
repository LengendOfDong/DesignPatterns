package com.zte.adapter.twodirect;

import com.zte.adapter.nopatter.LogDbOperateApi;
import com.zte.adapter.nopatter.LogModel;

import java.util.List;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public class LogDbOperate implements LogDbOperateApi {
    @Override
    public void createLog(LogModel lm) {
        System.out.println("now in LogDbOpterate createLog ,lm=" + lm);
    }

    @Override
    public void updateLog(LogModel lm) {
        System.out.println("now in LogDbOperate updateLog,lm=" + lm);

    }

    @Override
    public void removeLog(LogModel lm) {
        System.out.println("now in LogDbOperate removeLog,lm=" + lm);
    }

    @Override
    public List<LogModel> getAllLog() {
        System.out.println("now in LogDbOperate getAllLog");
        return null;
    }
}
