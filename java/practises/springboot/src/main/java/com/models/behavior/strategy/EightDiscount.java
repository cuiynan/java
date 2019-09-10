package com.models.behavior.strategy;

/**
 *
 */
public class EightDiscount implements Discount {


    /**
     * @param price
     * @return
     */
    @Override
    public double calculate(double price) {
        return 0.8 * price;
    }

}