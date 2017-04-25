package com.justted.chapter2.observer.WeatherStation;


/**
 * Created by Justted on 2017/3/19.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
