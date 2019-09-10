package com.models.struct.decorator;

public class Client {
    public static void main(String[] args) {

        Component component = new SpringConcrateComponent();
        Component component1 = new TomcatConcrateComponent();

        component.java();
        component1.java();

        Decrator decrator = new ConcrateDecrator(component);
        decrator.java();

        //我去，还能这么玩，看过N遍第一次看到.......
        Decrator decrator2 = new ConcrateDecrator(new ConcrateDecrator2(new TomcatConcrateComponent()));
        decrator2.java();
    }
}
