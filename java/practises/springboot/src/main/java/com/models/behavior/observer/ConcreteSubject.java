package com.models.behavior.observer;

import lombok.Data;

import java.util.*;

/**
 *
 */
@Data
public class ConcreteSubject implements ISubject {

    List<IObserver> observers = new ArrayList<>();

    /**
     * @param observer
     */
    @Override
    public void regist(IObserver observer) {
        observers.add(observer);
    }

    /**
     * @param observer
     */
    @Override
    public void unregist(IObserver observer) {
        observers.remove(observer);
    }

    /**
     *
     */
    @Override
    public void notifyObservers() {
        for (IObserver obs : observers) {
            obs.update(this);
        }
    }

    String msg;
    public void sendMsg(String msg){
        this.msg = msg;
        this.notifyObservers();
    }

}