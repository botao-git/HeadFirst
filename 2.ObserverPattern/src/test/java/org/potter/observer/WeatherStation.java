package org.potter.observer;

import org.junit.Test;
import org.potter.observer.observer.impl.CurrentMsgBoard;
import org.potter.observer.observer.impl.ForecastMsgBoard;
import org.potter.observer.observer.impl.StatisticsMsgBoard;
import org.potter.observer.subject.impl.WeatherData;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentMsgBoard currentMsgBoard = new CurrentMsgBoard(weatherData);
        ForecastMsgBoard forecastMsgBoard = new ForecastMsgBoard(weatherData);
        StatisticsMsgBoard statisticsMsgBoard = new StatisticsMsgBoard(weatherData);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                weatherData.changeMeasurements();
                System.out.println("----------------------------------");
            }
        }, 0, 5 * 1000);
    }
}
