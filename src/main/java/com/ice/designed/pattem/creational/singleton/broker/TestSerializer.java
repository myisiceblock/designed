package com.ice.designed.pattem.creational.singleton.broker;

import com.ice.designed.pattem.creational.singleton.doublechecked.DoubleCheckSingleton;
import com.ice.designed.pattem.creational.singleton.enumsingleton.EnumSingleton;
import com.ice.designed.pattem.creational.singleton.hungry.HungrySingleton;
import com.ice.designed.pattem.creational.singleton.lasy.LazySingleton;
import com.ice.designed.pattem.creational.singleton.staticinnerclass.StaticInnerClassSingleton;

import java.io.*;

public class TestSerializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        LazySingleton instance = LazySingleton.getInstance();
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        EnumSingleton instance = EnumSingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton")));
//        LazySingleton objectInstance = (LazySingleton) ois.readObject();
        DoubleCheckSingleton objectInstance = (DoubleCheckSingleton) ois.readObject();
//        HungrySingleton objectInstance = (HungrySingleton) ois.readObject();
//        StaticInnerClassSingleton objectInstance = (StaticInnerClassSingleton) ois.readObject();
//        EnumSingleton objectInstance = (EnumSingleton) ois.readObject();
        System.out.println(instance);
        System.out.println(objectInstance);
        System.out.println(instance == objectInstance);
    }
}
