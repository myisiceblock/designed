package com.ice.designed.pattem.creational.factorymethod;

public class PythonCourseFactory extends CourseFactory {

    @Override
    public Course getCourse() {
        return new PythonCourse();
    }
}
