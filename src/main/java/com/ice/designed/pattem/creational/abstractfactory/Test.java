package com.ice.designed.pattem.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.getCarDoor();
        car.getCarFrame();
        car.getCarBasePlate();
        car.make();
    }
}
