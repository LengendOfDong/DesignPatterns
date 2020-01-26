package com.zte.betterwithpattern;

/**
 * @author dadongge
 * @date 2020/1/26
 */
public class User {
    private String userId;

    private String username;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean dimission(){
        //1.要先通过中介者去除所有与这个人员相关的额部门和人员的关系
        DepUserMediatorImpl mediator =
                DepUserMediatorImpl.getInstance();
        mediator.deleteUser(userId);
        return true;
    }
}
