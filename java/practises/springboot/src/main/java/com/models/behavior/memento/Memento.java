package com.models.behavior.memento;

import lombok.Data;

/**
 *
 */
@Data
public class Memento {

    /**
     *
     */
    private int state;


    /**
     * @param state
     */
    public Memento(int state) {
        this.state = state;
    }

}