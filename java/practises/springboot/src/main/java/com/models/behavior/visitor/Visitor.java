package com.models.behavior.visitor;

/**
 *
 */
public abstract class Visitor {

    /**
     * @param games
     */
    public abstract void visit(Game games);

    /**
     * @param photos
     */
    public abstract void visit(Photos photos);

}