package com.ice.designed.pattem.creational.factorymethod;

public class JavaCourseFactory extends CourseFactory {
    @Override
    public Course getCourse() {
        return new JavaCourse();
    }
}
