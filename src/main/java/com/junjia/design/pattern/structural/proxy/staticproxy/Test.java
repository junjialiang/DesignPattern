package com.junjia.design.pattern.structural.proxy.staticproxy;

import com.junjia.design.pattern.structural.proxy.Order;

/**
 * Created by junjia
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
