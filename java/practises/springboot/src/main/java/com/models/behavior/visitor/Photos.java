package com.models.behavior.visitor;

/**
 *
 */
public class Photos extends Computer {

    /**
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void play() {
        System.out.println("图片访问了？");
    }

}