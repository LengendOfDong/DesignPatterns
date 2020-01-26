package com.zte.betterwithpattern;

/**
 * 1）如果一组对象之间的通信方式比较复杂，导致相互依赖，结构混乱，可以采用
 * 中介者模式，把这些对象相互的交互管理起来，各个对象都只需要和中介者交互，
 * 从而使得各个对象松散耦合，结构也更清晰易懂。
 * 2）如果一个对象引用很多的对象，并直接跟这些对象交互，导致难以复用该对象，可以
 * 采用中介者模式，把这个对象跟其他对象的交互封装到中介者对象里面，这个对象
 * 只需要和中介者对象交互就可以了。
 * @author dadongge
 * @date 2020/1/26
 */
public class Client {
    public static void main(String[] args){
        DepUserMediatorImpl mediator =
                DepUserMediatorImpl.getInstance();

        Dep dep = new Dep();
        dep.setDepId("d1");
        Dep dep2 = new Dep();
        dep2.setDepId("d2");
        User user = new User();
        user.setUserId("u1");

        System.out.println("撤销部门前-------------");
        mediator.showUserDeps(user);
        dep.deleteDep();
        System.out.println("撤销部门后-------------");
        mediator.showUserDeps(user);

        System.out.println("----------------------");
        System.out.println("人员离职前--------------");
        mediator.showDepUsers(dep2);
        user.dimission();
        System.out.println("人员离职后--------------");
        mediator.showDepUsers(dep2);
    }
}
