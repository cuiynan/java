package com.models.behavior.Interpreter;

/**
 *
 */
public class ActionNode extends AbstractNode {


    /**
     * @param context
     * @return
     */
    @Override
    public AbstractNode interpret(Context context) {
        System.out.println("机器人执行了" + context.getAction() + "行为");
        return this;
    }

}