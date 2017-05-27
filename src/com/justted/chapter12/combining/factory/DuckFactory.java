package com.justted.chapter12.combining.factory;

/**
 * Created by justted on 2017/5/22.
 */
public class DuckFactory extends AbstractDuckFactory {

    /*
    * 这个工厂用于创建没有装饰者的鸭子，在本例中并没有被用到，用的是另一个工厂
    * */

    @Override
    public Quackable creatMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable creatRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable creatDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable creatRubberDuck() {
        return new RubberDuck();
    }

    public Quackable creatGooseDuck(){
        return new GooseAdapter(new Goose());
    }
}
