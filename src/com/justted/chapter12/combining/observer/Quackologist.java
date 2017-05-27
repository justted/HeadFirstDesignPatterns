package com.justted.chapter12.combining.observer;

/**
 * Created by justted on 2017/5/24.
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
