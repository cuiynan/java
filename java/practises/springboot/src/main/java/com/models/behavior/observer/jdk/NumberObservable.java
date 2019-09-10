package com.models.behavior.observer.jdk;

import lombok.Data;

import java.util.Observable;

@Data
public class NumberObservable extends Observable {
    private int data = 0;

    public void setData(int data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }
}
