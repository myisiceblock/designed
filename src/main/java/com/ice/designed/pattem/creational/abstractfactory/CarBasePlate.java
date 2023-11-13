package com.ice.designed.pattem.creational.abstractfactory;

public class CarBasePlate extends CarBasePlateFactory {
    @Override
    public void make() {
        System.out.println("制作地盘");
    }
}
