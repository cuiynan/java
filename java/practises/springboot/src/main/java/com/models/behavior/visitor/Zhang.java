package com.models.behavior.visitor;

/**
 *
 */
public class Zhang extends Visitor {

    @Override
    public void visit(Game games) {
        games.play();
    }

    @Override
    public void visit(Photos photos) {
        photos.play();
    }
}