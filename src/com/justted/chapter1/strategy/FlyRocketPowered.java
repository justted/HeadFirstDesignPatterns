package com.justted.chapter1.strategy;

/**
 * Created by Justted on 2017/3/19.
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
