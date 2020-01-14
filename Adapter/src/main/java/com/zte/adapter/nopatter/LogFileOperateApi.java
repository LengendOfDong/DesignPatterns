package com.zte.adapter.nopatter;

import java.util.List;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public interface LogFileOperateApi {
    public List<LogModel> readLogFile();

    public void writeLogFile(List<LogModel> list);
}
