package com.ice.designed.pattem.structural.bridge;

public class Square implements Shape {
    @Override
    public void draw(String tools) {
        System.out.println("使用工具：" + tools + "画方形");
    }
}
