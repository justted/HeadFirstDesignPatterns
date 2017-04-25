package com.justted.chapter1.strategy;

/**
 * Created by Justted on 2017/3/19.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
