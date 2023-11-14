package com.ice.designed.pattem.structural.bridge;

public class Circle implements Shape {
    @Override
    public void draw(String tools) {
        System.out.println("使用工具：" + tools + "画圆形");
    }
}
