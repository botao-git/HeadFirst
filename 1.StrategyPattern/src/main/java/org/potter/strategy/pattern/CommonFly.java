package org.potter.strategy.pattern;

public class CommonFly implements FlyableInterface {
    @Override
    public void fly() {
        System.out.println("common fly: fly fly");
    }
}
