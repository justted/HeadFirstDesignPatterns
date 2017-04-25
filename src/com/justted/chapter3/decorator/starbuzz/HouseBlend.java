package com.justted.chapter3.decorator.starbuzz;

/**
 * Created by Justted on 2017/3/23.
 */
public class HouseBlend extends Beverage{
    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend() {
        description = "HouseBlend";
    }
}
