package com.ice.designed.pattem.creational.singleton.enumsingleton;

import java.io.Serializable;

public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
