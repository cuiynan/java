package com.models.behavior.Interpreter;

/**
 * @author : cuiyingnan
 * @date : 2019/6/13 11:17
 * @desc :
 *  本例使用解释器模式进行机器人模拟动作。使用场景还是可以这样玩的，不错。
 *  对行为封装的不错。
 */
public class Client {
    public static void main(String[] args) {

        AbstractNode action = new ActionNode();
        AbstractNode direct = new DirectionNode();
        AbstractNode dis = new DistanceNode();

        Context context = new Context();
        context.setAction("抬手");
        context.setDirec("东");
        context.setDistance(100);

        action.interpret(context);
        direct.interpret(context);
        dis.interpret(context);
    }
}
