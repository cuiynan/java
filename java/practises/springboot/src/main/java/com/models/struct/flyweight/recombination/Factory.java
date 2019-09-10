package com.models.struct.flyweight.recombination;

import java.util.Hashtable;

/**
 *
 */
public class Factory {

    private final static Hashtable flyweight;

    static {
        flyweight = new Hashtable();
        FlyWeight black = new BlackFlyWeight();
        FlyWeight red = new RedFlyWeight();
        flyweight.put("black", black);
        flyweight.put("red", red);
    }


    /**
     * @param key
     * @return
     */
    public static FlyWeight getFlyWight(String key) {
        return (FlyWeight) flyweight.get(key);
    }

}