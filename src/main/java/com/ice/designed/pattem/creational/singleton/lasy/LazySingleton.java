package com.ice.designed.pattem.creational.singleton.lasy;

import java.io.Serializable;

public class LazySingleton implements Serializable {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
        // 在使用getInstance之前可以使用反射无限获取单例对象
        // 只要使用getInstance方法获取单例对象，就会抛出异常
        synchronized (LazySingleton.class) {
            if (lazySingleton != null) {
                throw new RuntimeException("不允许通过反射创建单例对象");
            }
        }
    }

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        return lazySingleton;
    }

    private Object readResolve() {
        return lazySingleton;
    }
}
