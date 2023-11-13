package com.ice.designed.pattem.creational.abstractfactory;

public class CarFrame extends CarFrameFactory {
    @Override
    public void make() {
        System.out.println("制作车架");
    }
}
