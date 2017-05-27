package com.justted.chapter12.combining.observer;

/**
 * Created by justted on 2017/5/24.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
