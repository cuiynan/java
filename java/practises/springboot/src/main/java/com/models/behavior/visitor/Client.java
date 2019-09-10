package com.models.behavior.visitor;

/**
 * @author : cuiyingnan
 * @date : 2019/6/13 14:23
 * @desc : 访问者，多年前看过，但现在一点也想不起来了，现在看来还是比较晦涩难懂。
 *
 *
 */
public class Client {
    public static void main(String[] args) {
        ManageComputer manager = new ManageComputer();
        manager.add(new Game());
        manager.add(new Photos());


        Visitor li = new LI();
        manager.action(li);
    }
}
