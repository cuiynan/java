package com.models.struct.decorator;

/**
 * 第1个装饰类
 */
public class ConcrateDecrator extends Decrator {


    /**
     * @param component
     */
    public ConcrateDecrator(Component component) {
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
        System.out.println("我入门python了");
    }

}