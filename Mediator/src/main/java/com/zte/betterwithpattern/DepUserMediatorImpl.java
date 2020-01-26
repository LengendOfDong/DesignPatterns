package com.zte.betterwithpattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dadongge
 * @date 2020/1/26
 */
public class DepUserMediatorImpl {
    private static DepUserMediatorImpl mediator =
            new DepUserMediatorImpl();
    private DepUserMediatorImpl(){
        //调用初始化测试数据的功能
        initTestData();
    }

    public static DepUserMediatorImpl getInstance(){
        return mediator;
    }

    private Collection<DepUserModel> depUserCol =
            new ArrayList<DepUserModel>();

    private void initTestData(){
        DepUserModel du1 = new DepUserModel();
        du1.setDepUserId("du1");
        du1.setDepId("d1");
        du1.setUserId("u1");
        depUserCol.add(du1);

        DepUserModel du2 = new DepUserModel();
        du2.setDepUserId("du2");
        du2.setDepId("d1");
        du2.setUserId("u2");
        depUserCol.add(du2);

        DepUserModel du3 = new DepUserModel();
        du3.setDepUserId("du3");
        du3.setDepId("d2");
        du3.setUserId("u3");
        depUserCol.add(du3);

        DepUserModel du4 = new DepUserModel();
        du4.setDepUserId("du4");
        du4.setDepId("d2");
        du4.setUserId("u4");
        depUserCol.add(du4);

        DepUserModel du5 = new DepUserModel();
        du5.setDepUserId("du5");
        du5.setDepId("d2");
        du5.setUserId("u1");
        depUserCol.add(du5);

    }

    public boolean deleteDep(String depId){
        Collection<DepUserModel> tempCo1 = new ArrayList<DepUserModel>();
        for(DepUserModel du: depUserCol){
            if(du.getDepId().equals(depId)){
                tempCo1.add(du);
            }
        }
        depUserCol.removeAll(tempCo1);
        return true;
    }

    public boolean deleteUser(String userId){
        List<DepUserModel> tempCo1 = new ArrayList<DepUserModel>();
        for(DepUserModel du: depUserCol){
            if(du.getUserId().equals(userId)){
                tempCo1.add(du);
            }
        }
        depUserCol.removeAll(tempCo1);
        return true;
    }

    public void showDepUsers(Dep dep){
        for(DepUserModel du:depUserCol){
            if(du.getDepId().equals(dep.getDepId())){
                System.out.println("部门编号=" + dep.getDepId()
                + "下面拥有人员，其编号是：" + du.getUserId());
            }
        }
    }

    public void showUserDeps(User user){
        for(DepUserModel du:depUserCol){
            if(du.getUserId().equals(user.getUserId())){
                System.out.println("人员编号=" + user.getUserId()
                + "属于部门编号是：" + du.getDepId());
            }
        }
    }
}
