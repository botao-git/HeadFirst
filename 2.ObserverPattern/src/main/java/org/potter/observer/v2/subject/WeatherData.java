package org.potter.observer.v2.subject;

import java.util.Observable;
import java.util.Random;

/**
 * 这里使用 java.util 内置的 Observable来实现
 * Observable 相当于 Subject
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){}

    public void changeMeasurements(){
        setChanged();  // 修改 change 标记 为true
        notifyObservers(); // 通知观察者
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

    public void triggerChange(){
        Random random = new Random();
        this.temperature = random.nextFloat() * 100;
        this.humidity = random.nextFloat() * 100;
        this.pressure = random.nextFloat() * 100;
        changeMeasurements();
    }
}
