package com.junjia.design.pattern.structural.adapter.classadapter;

/**
 * Created by junjia
 */
public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();



    }
}
