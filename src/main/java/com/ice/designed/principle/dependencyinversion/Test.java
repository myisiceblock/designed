package com.ice.designed.principle.dependencyinversion;

public class Test {
    public static void main(String[] args) {
        JavaProgrammer javaProgrammer = new JavaProgrammer();
        javaProgrammer.eat();
        javaProgrammer.sleep();
        javaProgrammer.work();

        TestProgrammer testProgrammer = new TestProgrammer();
        testProgrammer.work();
    }
}
