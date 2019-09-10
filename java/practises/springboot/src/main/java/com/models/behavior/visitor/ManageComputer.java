package com.models.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ManageComputer {

    /**
     *
     */
    private final static List<Computer> computers;

    static {
        computers = new ArrayList<>();
    }


    /**
     * @param computer
     */
    public void add(Computer computer) {
        computers.add(computer);
    }

    /**
     * @param visitor
     */
    public void action(Visitor visitor) {
        for (Computer computer : computers) {
            computer.accept(visitor);
        }
    }

}