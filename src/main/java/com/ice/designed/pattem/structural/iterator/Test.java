package com.ice.designed.pattem.structural.iterator;

public class Test {
    public static void main(String[] args) {
        Container nameContainer = new NameContainer();
        for (Iterator iterator = nameContainer.getIterator(); iterator.hasNext(); ) {
            String name = (String) iterator.next();
            System.out.println("姓名 :::>>> " + name);
        }
    }
}
