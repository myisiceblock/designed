package com.ice.designed.pattem.creational.abstractfactory;

public class CarDoor extends CarDoorFactory {
    @Override
    public void make() {
        System.out.println("制作车门");
    }
}
