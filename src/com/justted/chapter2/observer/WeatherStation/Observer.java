package com.justted.chapter2.observer.WeatherStation;

/**
 * Created by Justted on 2017/3/19.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
