package com.ice.designed.pattem.creational.builder;

public class Test {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Engineer engineer = new Engineer();
        engineer.setCarBuilder(carBuilder);
        Car car = engineer.makeCar("制作汽车底盘", "制作汽车车架", "制作汽车车门");
        System.out.println(car);
    }
}
