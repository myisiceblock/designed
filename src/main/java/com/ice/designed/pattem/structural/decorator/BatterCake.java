package com.ice.designed.pattem.structural.decorator;

public class BatterCake extends ABatterCake{
    @Override
    protected String getInfo() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 6;
    }
}
