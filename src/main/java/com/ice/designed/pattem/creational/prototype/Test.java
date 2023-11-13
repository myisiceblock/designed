package com.ice.designed.pattem.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

//        Pig peki = new Pig();
//        peki.setName("佩奇");
//        peki.setDoSomething("吃蛋糕");
//        System.out.println(peki);
//
//        Pig george = new Pig();
//        george.setName("乔治");
//        george.setDoSomething("喜欢睡觉");
//        System.out.println(george);
//
//        Pig pigDad = new Pig();
//        pigDad.setName("猪爸爸");
//        pigDad.setDoSomething("喜欢开车");
//        System.out.println(pigDad);
//
//        Pig pigMum = new Pig();
//        pigMum.setName("猪妈妈");
//        pigMum.setDoSomething("喜欢做饭");
//        System.out.println(pigMum);

        //使用原型设计模式创建对象
        Pig peki = new Pig();
        peki.setName("佩奇");
        peki.setDoSomething("吃蛋糕");
        System.out.println(peki);

        Pig george = (Pig) peki.clone();
        george.setName("乔治");
        george.setDoSomething("喜欢睡觉");
        System.out.println(george);

        Pig pigDad = (Pig) peki.clone();
        pigDad.setName("猪爸爸");
        pigDad.setDoSomething("喜欢开车");
        System.out.println(pigDad);

        Pig pigMum = (Pig) peki.clone();
//        pigMum.setName("猪妈妈");
//        pigMum.setDoSomething("喜欢做饭");
        System.out.println(pigMum);
    }
}
