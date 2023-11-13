package com.ice.designed.pattem.creational.singleton.enumsingleton;

public class Test {
    public static void main(String[] args) {
        EnumSingleton e1 = EnumSingleton.getInstance();
        EnumSingleton e2 = EnumSingleton.getInstance();

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1 == e2);
    }
}
