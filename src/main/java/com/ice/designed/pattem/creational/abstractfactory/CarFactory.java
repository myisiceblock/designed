package com.ice.designed.pattem.creational.abstractfactory;

public interface CarFactory {

    public CarDoor getCarDoor();

    public CarFrame getCarFrame();

    public CarBasePlate getCarBasePlate();

    public void make();
}
