package com.models.behavior.Interpreter;

/**
 *
 */
public class DistanceNode extends AbstractNode {
    /**
     * @param context
     * @return
     */
    @Override
    public AbstractNode interpret(Context context) {
        System.out.println("转动轮子" + context.getDistance() + "米");
        return this;
    }

}