package com.models.struct.adapter;

import java.util.*;

/**
 * 
 */
public class Adaptee implements Target {

    /**
     * 
     */
    @Override
    public void c() {
        System.out.println("系统原有实现，我会C");

    }

    /**
     * 
     */
    @Override
    public void java() {
        System.out.println("系统原有实现，我会java");
    }

    /**
     * 
     */
    @Override
    public void python() {
        System.out.println("系统原有实现，我会python");
    }

}