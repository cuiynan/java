package com.models.behavior.Interpreter;

import java.util.*;

/**
 * 
 */
public class DirectionNode extends AbstractNode {

    /**
     * @param context 
     * @return
     */
    @Override
    public  AbstractNode interpret(Context context){
        System.out.println("开始向" + context.getDirec() + "方向转动");
        return this;
    }

}