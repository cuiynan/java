package com.models.behavior.observer.jdk;


import lombok.Data;

import java.util.Observable;
import java.util.Observer;

@Data
public class NumberObserver implements Observer {

    String name;

    public NumberObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        NumberObservable number = (NumberObservable) o;
        System.out.println(this.name + "被通知number设置为:" + number.getData());
    }
}
