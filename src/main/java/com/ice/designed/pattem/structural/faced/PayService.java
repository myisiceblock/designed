package com.ice.designed.pattem.structural.faced;

public class PayService {

    public void pay() {
        System.out.println("正在支付...");
    }

    public boolean checkBalance() {
        System.out.println("检查用户的余额...");
        return true;
    }
}
