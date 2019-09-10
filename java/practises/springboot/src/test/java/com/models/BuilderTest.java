package com.models;

import com.models.create.builder.ComputerBuilderImpl;
import com.models.create.builder.ComputerProduct;
import com.models.create.builder.LenovolFactory;
import org.junit.Test;

/**
 * 建造者设计模式
 */
public class BuilderTest {

    @Test
    public void build() {
        LenovolFactory factory = new LenovolFactory();
        ComputerProduct product = factory.createComputer(new ComputerBuilderImpl());
        System.out.println("-------已生成--------");
        System.out.println(product);
    }
}