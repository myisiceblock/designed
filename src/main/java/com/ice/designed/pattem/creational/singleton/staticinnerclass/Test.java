package com.ice.designed.pattem.creational.singleton.staticinnerclass;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Run());
        Thread t2 = new Thread(new Run());

        t1.start();
        t2.start();

        System.out.println("当前程序结束了");
    }
}
