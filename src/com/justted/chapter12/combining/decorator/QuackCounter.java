package com.justted.chapter12.combining.decorator;

/**
 * Created by justted on 2017/5/21.
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;    //全局变量

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }
}
