package com.models.behavior.mediator;

/**
 *
 */
public class Door extends Colleage {

    /**
     *
     */
    @Override
    public void ready() {
        System.out.println("门准备就绪");
    }


    /**
     *
     */
    @Override
    public void operation(String str) {
        System.out.println("门准备" + str);
    }

}