package com.ice.designed.pattem.creational.singleton.hungry;

public class Run implements Runnable{
    @Override
    public void run() {
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
