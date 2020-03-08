package org.potter.observer.subject.impl;

import org.potter.observer.observer.Observer;
import org.potter.observer.subject.Subject;

import java.util.ArrayList;
import java.util.Random;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }
    private Random random = new Random();
    public float getTemperature(){
        return random.nextFloat()*100;
    }
    public float getHumidity(){
        return random.nextFloat()*100;
    }
    public float getPressure(){
        return random.nextFloat()*100;
    }

    public void changeMeasurements(){
        this.temperature = getTemperature();
        this.humidity = getHumidity();
        this.pressure = getPressure();
        measurementsChanged();
    }

}
