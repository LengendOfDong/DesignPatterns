package com.zte.adapter.twodirect;

import com.zte.adapter.nopatter.LogDbOperateApi;
import com.zte.adapter.nopatter.LogFileOperate;
import com.zte.adapter.nopatter.LogFileOperateApi;
import com.zte.adapter.nopatter.LogModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dadongge
 * @date 2019/5/3
 */
public class Client {

    public static void main(String[] args){
        LogModel lml1 = new LogModel();
        lml1.setLogId("001");
        lml1.setOperateUser("admin");
        lml1.setOperateTime("2013-03-02 10:08:18");
        lml1.setLogContent("这是一个测试");
        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lml1);

        LogFileOperateApi fileLogApi = new LogFileOperate("");
        LogDbOperateApi dbLogApi = new LogDbOperate();

        LogFileOperateApi fileLogApi2 = new TwoDirectAdapter(fileLogApi,dbLogApi);
        LogDbOperateApi dbLogApi2 = new TwoDirectAdapter(fileLogApi,dbLogApi);

        dbLogApi2.createLog(lml1);
        List<LogModel> allLog = dbLogApi2.getAllLog();
        System.out.println("allLog=" + allLog);

        fileLogApi2.writeLogFile(list);
        fileLogApi2.readLogFile();
    }

}
