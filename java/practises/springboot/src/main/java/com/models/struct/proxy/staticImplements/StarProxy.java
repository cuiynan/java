package com.models.struct.proxy.staticImplements;

/**
 *
 */
public class StarProxy extends Star {

    /**
     * Default constructor
     */
    public StarProxy() {
    }

    @Override
    public void sing() {
        star.sing();
    }


    public Star star;

    public void setSar(Star star) {
        this.star = star;
    }

    public Star getStar() {
        return this.star;
    }

}