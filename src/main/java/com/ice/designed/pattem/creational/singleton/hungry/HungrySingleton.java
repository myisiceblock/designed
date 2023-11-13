package com.ice.designed.pattem.creational.singleton.hungry;

import com.ice.designed.pattem.creational.singleton.staticinnerclass.StaticInnerClassSingleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable {

    private static final HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if(hungrySingleton != null) {
            throw new RuntimeException("不允许通过反射创建单例对象");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }
}
