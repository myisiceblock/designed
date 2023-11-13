package com.ice.designed.pattem.creational.builder;

public abstract class Builder {

    public abstract void buildBasePlate(String basePlate);
    public abstract void buildFrame(String frame);
    public abstract void buildDoor(String door);

    public abstract Car makeCar();
}
