package com.models.behavior.visitor;

/**
 *
 */
public class Game extends Computer {


    /**
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void play() {
        System.out.println("游戏访问了？");
    }
}