package com.models.behavior.strategy;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Strategy {

    public Discount inspiration;

    public Strategy(Discount inspiration) {
        this.inspiration = inspiration;
    }

    public double caclu(double price) {
        double result = inspiration.calculate(price);
        log.info("原价是：" + price + "，折后价格：" + result);
        return result;
    }

}