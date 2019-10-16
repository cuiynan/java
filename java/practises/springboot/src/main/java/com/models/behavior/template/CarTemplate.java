package com.models.behavior.template;

/**
 * 
 */
public abstract class CarTemplate {

    /**
     * Default constructor
     */
    public CarTemplate() {
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
    protected abstract void oneStep();

    /**
     * 
     */
    protected abstract void twoStep();

    /**
     * 
     */
    protected abstract void threeStep();

}