package com.justted.chapter12.combining.factory;

/**
 * Created by justted on 2017/5/22.
 */
public class CountingDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable creatMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable creatRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable creatDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable creatRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
