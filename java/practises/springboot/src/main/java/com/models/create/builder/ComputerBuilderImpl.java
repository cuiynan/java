package com.models.create.builder;

/**
 * 
 */
public class ComputerBuilderImpl implements IComputerBuilder {
    /**
     * 
     */
    private ComputerProduct product = new ComputerProduct();


    /**
     * 
     */
    @Override
    public void cpu() {
        product.setCpu("cpu已组装");
        System.out.println("cpu已组装");
    }

    /**
     * 
     */
    @Override
    public void mem() {
        product.setMem("mem已组装");
        System.out.println("mem已组装");
    }

    /**
     * 
     */
    @Override
    public void screen() {
        product.setScreen("screen已组装");
        System.out.println("screen已组装");
    }

    /**
     * 
     */
    @Override
    public ComputerProduct build() {
       return this.product;
    }

}