package com.ice.designed.pattem.creational.singleton.doublechecked;

import java.io.Serializable;

public class DoubleCheckSingleton implements Serializable {

    private static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {
        if(doubleCheckSingleton != null) {
            throw new RuntimeException("不允许通过反射创建单例对象");
        }
    }

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }

        return doubleCheckSingleton;
    }

    private Object readResolve() {
        return doubleCheckSingleton;
    }
}
