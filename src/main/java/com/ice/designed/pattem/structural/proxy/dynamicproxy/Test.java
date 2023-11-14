package com.ice.designed.pattem.structural.proxy.dynamicproxy;

public class Test {
    public static void main(String[] args) {
        OrderService orderServiceProxy = (OrderService) new OrderServiceImplStaticProxy(new OrderServiceImpl()).bind();

        Order order = new Order();
        order.setInfo("购买华为 Meta 60 Pro Max");
        order.setUserId("2");

        orderServiceProxy.saveOrder(order);
    }
}
