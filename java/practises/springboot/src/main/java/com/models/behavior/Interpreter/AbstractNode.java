package com.models.behavior.Interpreter;

/**
 *
 */
public abstract class AbstractNode {
    /**
     * @param context
     * @return
     */
    public abstract AbstractNode interpret(Context context);

}