package com.models.create.builder;

/**
 *
 */
public interface IComputerBuilder {


    /**
     *
     */
    void cpu();

    /**
     *
     */
    void mem();

    /**
     *
     */
    void screen();

    /**
     *
     */
    ComputerProduct build();

}