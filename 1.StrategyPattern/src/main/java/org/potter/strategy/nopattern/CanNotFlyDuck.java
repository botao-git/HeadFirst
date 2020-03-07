package org.potter.strategy.nopattern;

public class CanNotFlyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Duck can not fly");
    }

    @Override
    public void fly() {
        System.out.println("override fly() , disable fly skill");
    }
}
