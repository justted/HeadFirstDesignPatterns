package com.justted.chapter12.combining.observer;

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

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();    //这一行要不要都不影响，因为notifyObserver是每个鸭子单独完成的
    }
}
