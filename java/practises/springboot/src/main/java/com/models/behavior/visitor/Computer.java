package com.models.behavior.visitor;

/**
 *
 */
public abstract class Computer {

    /**
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

}