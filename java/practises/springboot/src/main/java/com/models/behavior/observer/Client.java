package com.models.behavior.observer;

/**
 *  观察者，这个还是比较经典，已第N次编写了，最初还是会遇到问题。
 *  以后常过来看看，以免因时间过长而生疏。
 */
public class Client {

    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();

        User zs = new User("zhangsan");
        User ls = new User("lisi");
        User wy = new User("wangyuan");

        subject.regist(zs);
        subject.regist(ls);
        subject.regist(wy);

        ((ConcreteSubject) subject).sendMsg("小偷抢银行了");

        subject.unregist(ls);
        ((ConcreteSubject) subject).sendMsg("有内监");
    }

}