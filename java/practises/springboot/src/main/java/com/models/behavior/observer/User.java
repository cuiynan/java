package com.models.behavior.observer;

import lombok.Data;

/**
 *
 */
@Data
public class User implements IObserver {

    public User(String name) {
        setName(name);
    }

    /**
     *
     */
    private String name;


    @Override
    public void update(ISubject subject) {
        System.out.println(this.name + "被通知" + ((ConcreteSubject) subject).getMsg());
    }
}