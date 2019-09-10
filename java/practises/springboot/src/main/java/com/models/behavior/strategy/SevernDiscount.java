package com.models.behavior.strategy;

/**
 *
 */

public class SevernDiscount implements Discount {


    /**
     * @param price
     * @return
     */
    @Override
    public double calculate(double price) {
        return 0.7 * price;
    }

}