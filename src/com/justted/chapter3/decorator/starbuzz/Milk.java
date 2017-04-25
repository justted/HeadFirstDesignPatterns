package com.justted.chapter3.decorator.starbuzz;

/**
 * Created by Justted on 2017/3/24.
 */
public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
