package com.ice.designed.pattem.structural.strategy;

public class MultiplyStrategy implements Strategy {
    @Override
    public int operator(int num1, int num2) {
        return num1 * num2;
    }
}
