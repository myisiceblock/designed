package com.ice.designed.pattem.structural.faced;

public class TackingSystem {

    private SelectFoodService selectFoodService;
    private PayService payService;
    private OrderService orderService;

    public TackingSystem() {
        selectFoodService = new SelectFoodService();
        payService = new PayService();
        orderService = new OrderService();
    }

    public void orderTacking(Food food) {
        selectFoodService.select(food.getName());
        boolean flag = payService.checkBalance();
        if(flag) {
            payService.pay();

            orderService.makeOrder();
        }
    }
}
