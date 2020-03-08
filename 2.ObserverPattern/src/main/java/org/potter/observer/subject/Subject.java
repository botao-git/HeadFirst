package org.potter.observer.subject;

import org.potter.observer.observer.Observer;

/**
 * 主题接口
 * 拥有注册和移除观察者的功能
 * 每个主题可以有多个观察者
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
