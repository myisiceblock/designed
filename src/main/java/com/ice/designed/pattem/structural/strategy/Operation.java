package com.ice.designed.pattem.structural.strategy;

public class Operation {
    private Strategy strategy;

    public Operation(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.operator(num1, num2);
    }
}
