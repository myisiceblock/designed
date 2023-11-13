package com.ice.designed.pattem.creational.abstractfactory;

public class Car implements CarFactory {

    private CarDoor carDoor = null;
    private CarFrame carFrame = null;
    private CarBasePlate carBasePlate = null;

    @Override
    public CarDoor getCarDoor() {
        carDoor = new CarDoor();
        return carDoor;
    }

    @Override
    public CarFrame getCarFrame() {
        carFrame = new CarFrame();
        return carFrame;
    }

    @Override
    public CarBasePlate getCarBasePlate() {
        carBasePlate = new CarBasePlate();
        return carBasePlate;
    }

    @Override
    public void make() {
        carDoor.make();
        carFrame.make();
        carBasePlate.make();
        System.out.println("小汽车制作完成");
    }
}
