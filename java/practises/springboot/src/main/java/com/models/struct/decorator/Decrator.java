package com.models.struct.decorator;

import java.util.*;

/**
 * 
 */
public class Decrator implements Component {

    /**
     * 
     */
    public Component component;

    /**
     * @param component
     */
    public Decrator(Component component) {
        this.component =  component;
    }

    /**
     * 
     */
    @Override
    public void java() {
        component.java();
    }

}