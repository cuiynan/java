package com.models.behavior.visitor;

import java.util.*;

/**
 * 
 */
public class LI extends Visitor {


    @Override
    public void visit(Game games) {
        games.play();
    }

    @Override
    public void visit(Photos photos) {
        photos.play();
    }
}