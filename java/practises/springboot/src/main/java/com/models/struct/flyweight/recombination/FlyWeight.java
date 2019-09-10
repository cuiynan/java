package com.models.struct.flyweight.recombination;

/**
 *
 */
public abstract class FlyWeight {

    /**
     *
     */
    public void display(Coordinates coordinates) {
        System.out.println("颜色是：" + this.getColor() + coordinates.getX() + "," + coordinates.getY());
    }

    /**
     * @return
     */
    public abstract String getColor();

}