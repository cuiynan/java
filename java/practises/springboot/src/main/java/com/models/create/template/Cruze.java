package com.models.create.template;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class Cruze extends Template {

    /**
     * Default constructor
     */
    public Cruze() {
    }

    /**
     *
     */
    public void oneStep() {
        System.out.println("小科组装1");
    }

    /**
     *
     */
    public void twoStep() {
        System.out.println("小科组装2");
    }

    /**
     *
     */
    public void threeStep() {
        System.out.println("小科组装3");
    }

}