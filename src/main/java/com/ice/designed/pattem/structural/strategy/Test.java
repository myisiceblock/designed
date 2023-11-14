package com.ice.designed.pattem.structural.strategy;

public class Test {
    public static void main(String[] args) {
        Operation operation = new Operation(new AddStrategy());
        System.out.println("10 + 5 = " + operation.execute(10, 5));

        Operation operation1 = new Operation(new SubtractStrategy());
        System.out.println("10 - 5 = " + operation1.execute(10, 5));

        Operation operation2 = new Operation(new MultiplyStrategy());
        System.out.println("10 * 5 = " + operation2.execute(10,5));
    }
}
