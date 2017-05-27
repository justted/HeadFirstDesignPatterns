package com.justted.chapter12.combining.decorator;

/**
 * Created by justted on 2017/5/20.
 */
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
