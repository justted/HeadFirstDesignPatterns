package com.justted.chapter3.decorator.starbuzz;

/**
 * Created by Justted on 2017/3/23.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
