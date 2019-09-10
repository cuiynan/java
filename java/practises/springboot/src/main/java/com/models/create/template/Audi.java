package com.models.create.template;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class Audi extends Template {

    /**
     * Default constructor
     */
    public Audi() {
    }

    /**
     * 
     */
    public void oneStep(){
        System.out.println("奥迪组装1");
    }

    /**
     * 
     */
    public void twoStep(){
        System.out.println("奥迪组装2");
    }

    /**
     * 
     */
    public  void threeStep(){
        System.out.println("奥迪组装3");
    }

}