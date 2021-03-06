package com.zte.adapter.twodirect;

import com.zte.adapter.nopatter.LogDbOperateApi;
import com.zte.adapter.nopatter.LogFileOperateApi;
import com.zte.adapter.nopatter.LogModel;

import java.util.List;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public class TwoDirectAdapter implements LogDbOperateApi,LogFileOperateApi {
    private LogFileOperateApi fileLog;

    private LogDbOperateApi dbLog;

    public TwoDirectAdapter(LogFileOperateApi fileLog,LogDbOperateApi dbLog){
        this.fileLog = fileLog;
        this.dbLog = dbLog;
    }

    @Override
    public void createLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        list.add(lm);
        fileLog.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        for(int i=0; i<list.size();i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.set(i,lm);
                break;
            }
        }
        fileLog.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
        List<LogModel> list = fileLog.readLogFile();
        list.remove(lm);
        fileLog.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return fileLog.readLogFile();
    }

    @Override
    public List<LogModel> readLogFile() {
        return dbLog.getAllLog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        for(LogModel lm : list){
            dbLog.createLog(lm);
        }
    }
}
