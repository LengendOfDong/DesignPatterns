package com.zte.adapter.intelliAdapter;

import com.zte.adapter.nopatter.LogModel;

import java.util.List;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public interface LogJVMOperateApi {
    public List<LogModel> readLogFile();

    public void writeLogFile(List<LogModel> list);
}
