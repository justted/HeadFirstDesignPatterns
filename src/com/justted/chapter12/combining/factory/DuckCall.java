package com.justted.chapter12.combining.factory;

/**
 * Created by justted on 2017/5/20.
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
