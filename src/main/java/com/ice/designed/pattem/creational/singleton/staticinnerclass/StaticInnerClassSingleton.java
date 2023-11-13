package com.ice.designed.pattem.creational.singleton.staticinnerclass;

import java.io.Serializable;

public class StaticInnerClassSingleton implements Serializable {

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {
        if(InnerClass.staticInnerClassSingleton != null) {
            throw new RuntimeException("不允许通过反射创建单例对象");
        }
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private Object readResolve() {
        return InnerClass.staticInnerClassSingleton;
    }
}
