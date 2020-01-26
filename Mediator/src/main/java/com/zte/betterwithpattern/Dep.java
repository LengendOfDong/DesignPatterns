package com.zte.betterwithpattern;

/**
 * @author dadongge
 * @date 2020/1/26
 */
public class Dep {
    private String depId;

    private String depName;

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public boolean deleteDep(){
        //1.要先通过中介者去除掉所有与这个部门相关的额部门和人员的关系
        DepUserMediatorImpl mediator =
             DepUserMediatorImpl.getInstance();
        mediator.deleteDep(depId);
        return true;
    }
}
