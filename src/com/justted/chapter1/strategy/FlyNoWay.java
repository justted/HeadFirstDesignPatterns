package com.justted.chapter1.strategy;

/**
 * Created by Justted on 2017/3/19.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly(){
        System.out.println("I can't fly");
    }
}
