package com.justted.chapter7.adapter.ducks;

/**
 * Created by justted on 2017/4/12.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
