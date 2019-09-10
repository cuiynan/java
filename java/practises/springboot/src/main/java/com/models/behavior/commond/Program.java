package com.models.behavior.commond;

import java.util.*;

/**
 *
 */
public abstract class Program extends Coding {
    @Override
    public void execute() {
        this.coding();
        this.docing();
        this.testing();
    }

    /**
     *
     */
    public abstract void coding();

    /**
     *
     */
    public abstract void docing();

    /**
     *
     */
    public abstract void testing();

}