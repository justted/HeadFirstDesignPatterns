package com.justted.chapter1.strategy;

/**
 * Created by Justted on 2017/3/19.
 */
public class ModelDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I'm a model ducks");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
