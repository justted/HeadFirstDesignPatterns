package com.justted.chapter3.decorator.starbuzz;

/**
 * Created by Justted on 2017/3/23.
 */
public class Decaf extends Beverage {
    @Override
    public double cost() {
        return 1.05;
    }

    public Decaf() {
        description = "Decaf";
    }
}
