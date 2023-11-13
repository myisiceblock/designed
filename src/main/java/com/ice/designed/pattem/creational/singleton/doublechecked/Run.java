package com.ice.designed.pattem.creational.singleton.doublechecked;

public class Run implements Runnable{
    @Override
    public void run() {
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
