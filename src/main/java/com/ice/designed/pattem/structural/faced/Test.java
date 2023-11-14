package com.ice.designed.pattem.structural.faced;

public class Test {

    public static void main(String[] args) {
        Food food = new Food();
        food.setName("鱼香肉丝");

        TackingSystem tackingSystem = new TackingSystem();
        tackingSystem.orderTacking(food);
    }
}
