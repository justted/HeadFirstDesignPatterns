package com.justted.chapter2.observer.WeatherStationObservable;

/**
 * Created by Justted on 2017/3/19.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurments(80, 65, 30.4f);
        weatherData.setMeasurments(82, 70, 29.2f);
        weatherData.setMeasurments(78, 90, 29.2f);
    }
}
