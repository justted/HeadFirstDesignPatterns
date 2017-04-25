package com.justted.chapter7.adapter.ducks;

import java.util.Random;

/**
 * Created by justted on 2017/4/12.
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (rand.nextInt(5) == 0){ //这里取0-4的随机整数，等于0就让鸭子飞一下，实现鸭子差不多五次飞一次的机会
            duck.fly();
        }
    }
}
