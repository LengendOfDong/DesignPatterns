package com.zte.adapter.intelliAdapter;

import com.zte.adapter.nopatter.LogDbOperateApi;
import com.zte.adapter.nopatter.LogFileOperateApi;
import com.zte.adapter.nopatter.LogModel;

import java.util.List;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public class Adapter implements LogDbOperateApi {

    private LogFileOperateApi adaptee;
    private LogJVMOperateApi  jvmadaptee;

    public Adapter(LogFileOperateApi adaptee,LogJVMOperateApi jvmadaptee){
        this.adaptee = adaptee;
        this.jvmadaptee = jvmadaptee;
    }

    @Override
    public void createLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        list.add(lm);
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel lm) {
        List<LogModel> list = adaptee.readLogFile();
        for(int i=0; i < list.size() ; i++){
            if(list.get(i).getLogId().equals(lm.getLogId())){
                list.set(i,lm);
                break;
            }
        }
        adaptee.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel lm) {
         List<LogModel> list = adaptee.readLogFile();
         list.remove(lm);
         adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
