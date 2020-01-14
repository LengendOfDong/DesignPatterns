package com.zte.adapter.rewrite;

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
        LogModel lml = new LogModel();
        lml.setLogId("001");
        lml.setOperateUser("admin");
        lml.setOperateTime("2013-03-02 10:08:18");
        lml.setLogContent("这是一个测试");

        List<LogModel> list = new ArrayList<LogModel>();
        list.add(lml);
        LogFileOperateApi LogFileApi = new LogFileOperate("");
        LogDbOperateApi api = new Adapter(LogFileApi);
        api.createLog(lml);
        List<LogModel> allLog = api.getAllLog();
        System.out.println("allLog= " + allLog);


    }
}
