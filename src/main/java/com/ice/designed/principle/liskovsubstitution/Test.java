package com.ice.designed.principle.liskovsubstitution;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        System.out.println("1+2=" + teacher.fun1(1, 2));

        Student student = new Student();
        student.setTeacher(teacher);
        System.out.println("1+2=" + student.fun1(1, 2));
        System.out.println("1+2+10=" + student.fun2(1, 2));
        System.out.println("1-2=" + student.fun3(1, 2));
    }
}
