package com.ice.designed.pattem.structural.templatemethod;

public class Test {
    public static void main(String[] args) {
        AClass c = new DesignPatternClass(true);
        c.makeClass();

        JavaClass javaClass = new JavaClass();
        javaClass.makeClass();
    }
}
