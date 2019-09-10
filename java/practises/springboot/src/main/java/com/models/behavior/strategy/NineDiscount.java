package com.models.behavior.strategy;

/**
 *
 */
public class NineDiscount implements Discount {

    /**
     * @param price
     * @return
     */
    @Override
    public double calculate(double price) {
        return 0.9 * price;
    }

}