package com.models.behavior.template;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class Cruze extends CarTemplate {

    /**
     * Default constructor
     */
    public Cruze() {
    }

    /**
     *
     */
    @Override
    protected void oneStep() {
        System.out.println("小科组装1");
    }

    /**
     *
     */
    @Override
    protected void twoStep() {
        System.out.println("小科组装2");
    }

    /**
     *
     */
    @Override
    protected void threeStep() {
        System.out.println("小科组装3");
    }

}