package com.ice.designed.principle.composititionaggregation;


public class Test {

    public static void main(String[] args) {
//        Teacher teacher = new Teacher();
//        teacher.call();
//        Student student = new Student();
//        student.notifyMessing();
//        Parent parent = new Parent();
//        parent.messing();
        Teacher teacher = new Teacher();
        WxNotify wxNotify = new WxNotify();
        Parent parent = new Parent();
        wxNotify.setParent(parent);
        teacher.setNotify(wxNotify);
        teacher.call();
    }
}
