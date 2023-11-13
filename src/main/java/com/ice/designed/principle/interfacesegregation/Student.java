package com.ice.designed.principle.interfacesegregation;

public class Student implements EatAction, SleepAction, SwimAction {
    @Override
    public void eat() {
        System.out.println("学生在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("学生在睡觉");
    }

    @Override
    public void swim() {
        System.out.println("学生在游泳");
    }
}
