package com.subscribeobserve.jdk;

import java.util.Observable;

/**
 * @author : cuiyingnan
 * @date : 2019/8/27 10:31
 * @desc : 使用jdk中的订阅者 及 发布者
 */
public class Subscribe {
    public static void main(String[] args) {
        Observer observer = new Observer();
        observer.addObserver(new java.util.Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(arg.toString());
            }
        });

        observer.setChanged();
        observer.notifyObservers("中文试一下");
        observer.setChanged();
        observer.notifyObservers("adfadfadfadf");
    }
}

/**
 * 使用 jdk 自带实现
 */
class Observer extends Observable{
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}