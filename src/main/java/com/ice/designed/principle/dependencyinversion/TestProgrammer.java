package com.ice.designed.principle.dependencyinversion;

public class TestProgrammer extends Programmer{

    @Override
    public void eat() {
        System.out.println("测试工程师在吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("测试工程师在睡觉");
    }

    @Override
    public void work() {
        System.out.println("测试工作室在工作");
    }
}
