package com.models.create.builder;

/**
 * 工厂生产计算机
 */
public class LenovolFactory {

    /**
     * @return
     */
    public ComputerProduct createComputer(IComputerBuilder computerBuilder) {
        computerBuilder.cpu();
        computerBuilder.mem();
        computerBuilder.screen();

        return computerBuilder.build();
    }

}