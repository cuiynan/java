package com.models.behavior.strategy;

public class Client {

    public static void main(String[] args) {
        Strategy strategy = new Strategy(new EightDiscount());
        strategy.caclu(100);
    }
}
