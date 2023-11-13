package com.ice.designed.pattem.creational.simplefactory;

public class JavaCourse extends Course {
    @Override
    public void make() {
        System.out.println("制作Java课程");
    }
}
