package com.models.behavior.mediator;

/**
 *
 */
public class Music extends Colleage {


    /**
     *
     */
    @Override
    public void ready() {
        System.out.println("音乐机准备就绪");
    }

    /**
     *
     */
    @Override
    public void operation(String str) {
        System.out.println("音乐机准备" + str);
    }

}