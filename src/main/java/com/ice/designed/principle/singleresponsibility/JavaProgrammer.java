package com.ice.designed.principle.singleresponsibility;

public class JavaProgrammer extends Programmer {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public void eat() {
        order.task();
//        System.out.println("Java程序员在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("Java程序员在睡觉");
    }

    @Override
    public void work() {
        System.out.println("Java程序员在工作");
    }

//    public void orderTake() {
//        System.out.println("Java程序员在订外卖");
//    }
}
