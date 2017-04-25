package com.justted.chapter3.decorator.starbuzz;

/**
 * Created by Justted on 2017/3/23.
 */
public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    public Espresso() {
        description = "Espresso";
    }
}
