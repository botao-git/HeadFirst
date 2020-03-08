package org.potter.observer.observer;

/**
 * 所有观察者必须实现Observer接口
 * 这个接口只有一个update方法，当主题状态改变时它被调用
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
