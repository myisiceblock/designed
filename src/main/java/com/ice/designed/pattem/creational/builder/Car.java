package com.ice.designed.pattem.creational.builder;

public class Car {

    private String basePlate;

    private String frame;

    private String door;

    public String getBasePlate() {
        return basePlate;
    }

    public void setBasePlate(String basePlate) {
        this.basePlate = basePlate;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "basePlate='" + basePlate + '\'' +
                ", frame='" + frame + '\'' +
                ", door='" + door + '\'' +
                '}';
    }
}
