package com.justted.chapter1.strategy;

/**
 * Created by Justted on 2017/3/19.
 */
public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
