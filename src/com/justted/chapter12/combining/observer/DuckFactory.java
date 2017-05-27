package com.justted.chapter12.combining.observer;

/**
 * Created by justted on 2017/5/22.
 */
public class DuckFactory extends AbstractDuckFactory {

    /*
    * 这个工厂用于创建没有装饰者的鸭子，在本例中并没有被用到，用的是另一个工厂
    * */

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    public Quackable createGooseDuck(){
        return new GooseAdapter(new Goose());
    }
}
