package org.potter.observer;


import org.potter.observer.v2.observer.CurrentMsgBoard;
import org.potter.observer.v2.observer.ForecastMsgBoard;
import org.potter.observer.v2.subject.WeatherData;

import java.util.Timer;
import java.util.TimerTask;

public class WeatherStationV2 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentMsgBoard currentMsgBoard = new CurrentMsgBoard(weatherData);
        ForecastMsgBoard forecastMsgBoard = new ForecastMsgBoard(weatherData);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                weatherData.triggerChange();
                System.out.println("----------------------------------");
            }
        }, 0, 5 * 1000);
    }
}
