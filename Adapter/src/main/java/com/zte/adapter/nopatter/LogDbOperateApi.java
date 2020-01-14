package com.zte.adapter.nopatter;

import java.util.List;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public interface LogDbOperateApi {
    public void createLog(LogModel lm);
    public void updateLog(LogModel lm);
    public void removeLog(LogModel lm);
    public List<LogModel> getAllLog();
}
