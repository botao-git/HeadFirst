package org.potter.observer.v2.observer;

import org.potter.observer.v2.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentMsgBoard implements Observer,MsgBoard {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentMsgBoard(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("current temperature : " + temperature + ", " + humidity + ", " + pressure );
    }
}
