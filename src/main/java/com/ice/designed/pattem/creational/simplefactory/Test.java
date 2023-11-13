package com.ice.designed.pattem.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
//        Course javaCourse = courseFactory.getCourse("java");
//        javaCourse.make();
        Course pythonCourse = courseFactory.getCourse("python");
        pythonCourse.make();
    }
}
