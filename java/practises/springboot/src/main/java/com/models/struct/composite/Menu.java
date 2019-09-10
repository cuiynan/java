package com.models.struct.composite;

/**
 *
 */
public abstract class Menu {

    /**
     *
     */
    public abstract void add(Menu menu);

    /**
     *
     */
    public abstract void remove(Menu menu);

    /**
     *
     */
    public abstract Menu get(int i);

    abstract void display(int depth);

}