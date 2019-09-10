package com.models.struct.decorator;

/**
 *  第2个装饰类
 */
public class ConcrateDecrator2 extends Decrator {


    /**
     * @param component
     */
    public ConcrateDecrator2(Component component) {
        super(component);
    }

    /**
     *
     */
    @Override
    public void java() {
        component.java();
        System.out.println("这时新增加一项技能");
        this.otherTechnology();
    }

    private void otherTechnology() {
        System.out.println("我入门R了");
    }

}