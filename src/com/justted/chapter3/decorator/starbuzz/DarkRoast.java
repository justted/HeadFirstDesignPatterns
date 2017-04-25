package com.justted.chapter3.decorator.starbuzz;

/**
 * Created by Justted on 2017/3/23.
 */
public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return .99;
    }

    public DarkRoast() {
        description = "DarkRoast";
    }
}
