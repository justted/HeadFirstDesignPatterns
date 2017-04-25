package com.justted.chapter2.observer.WeatherStationObservable;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Justted on 2017/3/19.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();//比非内置版本多出这一句，推数据时直接引参就有temp，而拉数据时必须要从getter处取得
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }
            display();
        }
    }
}
