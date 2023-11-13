package com.ice.designed.pattem.creational.singleton.broker;

import com.ice.designed.pattem.creational.singleton.enumsingleton.EnumSingleton;
import com.ice.designed.pattem.creational.singleton.lasy.LazySingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestReflect {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clz = LazySingleton.class;
        //单例模式一共5种,懒汉,饿汉,静态内部类,双重检查,枚举
//        Class clz = EnumSingleton.class;

        //创建构造器对象
        Constructor constructor = clz.getDeclaredConstructor();

        //枚举类型的单例模式,在创建构造方法时,需要给两个参数
        //该参数是源码种体现的,String,int
        //Cannot reflectively create enum objects
        //在使用枚举时,通过反射创建单例对象时,是不允许创建的,会抛出异常
        //在其他的单例模式中也可以模拟这种实现方式,不允许通过反射创建
//        Constructor constructor = clz.getDeclaredConstructor(String.class, int.class);


        constructor.setAccessible(true);

        LazySingleton instance = LazySingleton.getInstance();
//        EnumSingleton instance = EnumSingleton.getInstance();

        LazySingleton clzInstance = (LazySingleton) constructor.newInstance();
//        EnumSingleton clzInstance = (EnumSingleton) constructor.newInstance("ice",666   );


        System.out.println(instance);
        System.out.println(clzInstance);
        System.out.println(instance == clzInstance);
    }
}
