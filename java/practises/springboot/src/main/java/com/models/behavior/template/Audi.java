package com.models.behavior.template;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class Audi extends CarTemplate {

    /**
     * Default constructor
     */
    public Audi() {
    }

    /**
     * 
     */
    @Override
    protected void oneStep(){
        System.out.println("奥迪组装1");
    }

    /**
     * 
     */
    @Override
    protected void twoStep(){
        System.out.println("奥迪组装2");
    }

    /**
     * 
     */
    @Override
    protected  void threeStep(){
        System.out.println("奥迪组装3");
    }

}