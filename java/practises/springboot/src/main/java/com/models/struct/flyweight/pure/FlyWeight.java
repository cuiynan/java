package com.models.struct.flyweight.pure;

/**
 *
 */
public abstract class FlyWeight {

    /**
     *
     */
    public void display() {
        System.out.println("颜色是：" + this.getColor());
    }

    /**
     * @return
     */
    public abstract String getColor();

}