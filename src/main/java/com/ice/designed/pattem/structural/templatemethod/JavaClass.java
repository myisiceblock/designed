package com.ice.designed.pattem.structural.templatemethod;

public class JavaClass extends AClass {
    @Override
    protected boolean flag() {
        return true;
    }

    @Override
    public void isMakeNote() {
        System.out.println("提供Java课程的素材及代码");
    }
}
