package com.ice.designed.pattem.structural.proxy.staticproxy;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setInfo("订单信息,购买IPhone100x");
        order.setUserId("1");

        OrderServiceImplStaticProxy orderServiceImplStaticProxy = new OrderServiceImplStaticProxy();
        orderServiceImplStaticProxy.saveOrder(order);
    }
}
