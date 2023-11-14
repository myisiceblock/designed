package com.ice.designed.pattem.structural.bridge;

public class Test {
    public static void main(String[] args) {
        Tools tools = new Pencil(new Circle());
        tools.use();

        Tools tools1 = new Pen(new Square());
        tools1.use();
    }
}
