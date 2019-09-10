package com.models.create.strategy;

import org.springframework.stereotype.Component;

/**
 *  第一个宝盒
 */
@Component
public class One implements Inspiration {
    /**
     * Default constructor
     */
    public One() {
    }

    /**
     * 
     */
    public void oepn() {
        System.out.println("here is first way");
    }

}