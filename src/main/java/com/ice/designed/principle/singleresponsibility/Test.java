package com.ice.designed.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer = new JavaProgrammer();
//        javaProgrammer.eat();
//        javaProgrammer.sleep();
//        javaProgrammer.work();
//        javaProgrammer.orderTake();
        javaProgrammer.setOrder(new Order());
        javaProgrammer.eat();
        javaProgrammer.work();
        javaProgrammer.sleep();
    }
}
