package com.justted.chapter9.composite.MenuIterator;

import java.util.Iterator;

/**
 * Created by justted on 2017/4/29.
 */
public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public void print(){      //打印出完整的菜单项条目，这些之前是在waitress里实现的
        System.out.print("  " + getName());
        if (isVegetarian()){
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("    -- " + getDescription());
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
}