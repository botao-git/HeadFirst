package org.potter.observer.observer.impl;

import org.potter.observer.observer.Observer;
import org.potter.observer.subject.Subject;

public class ForecastMsgBoard implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public ForecastMsgBoard(Subject weatherData) {
        this.weatherData = weatherData; // 构造函数中使用完之后似乎用不着这个 Subject对象，但是我们可能想要取消注册，所以暂时保留
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast value: " + temperature + ", " + humidity + ", " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
