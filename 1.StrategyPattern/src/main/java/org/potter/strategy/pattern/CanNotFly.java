package org.potter.strategy.pattern;

public class CanNotFly implements FlyableInterface {
    @Override
    public void fly() {
        System.out.println("Sorry, I can not fly");
    }
}
