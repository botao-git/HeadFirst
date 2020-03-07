package org.potter.strategy.pattern;

public class RocketFly implements FlyableInterface{
    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }
}
