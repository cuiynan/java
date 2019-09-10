package com.models.create.template;

/**
 * 
 */
public abstract class Template {

    /**
     * Default constructor
     */
    public Template() {
    }

    /**
     * 
     */
    public void create() {
       this.oneStep();
       this.twoStep();
       this.threeStep();
    }

    /**
     * 
     */
    public abstract void oneStep();

    /**
     * 
     */
    public abstract void twoStep();

    /**
     * 
     */
    public abstract void threeStep();

}