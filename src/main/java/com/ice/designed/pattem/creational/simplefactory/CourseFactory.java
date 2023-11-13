package com.ice.designed.pattem.creational.simplefactory;

public class CourseFactory {

    public Course getCourse(String course) {
        if ("java".equalsIgnoreCase(course)) {
            return new JavaCourse();
        } else if ("python".equalsIgnoreCase(course)) {
            return new PythonCourse();
        }
        return null;
    }
}
