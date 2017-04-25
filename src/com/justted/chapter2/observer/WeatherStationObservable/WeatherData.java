package com.justted.chapter2.observer.WeatherStationObservable;

import java.util.Observable;

/**
 * Created by Justted on 2017/3/22.
 */
public class WeatherData extends Observable{

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {  }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurments(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
