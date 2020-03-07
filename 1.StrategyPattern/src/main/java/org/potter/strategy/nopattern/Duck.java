package org.potter.strategy.nopattern;

public abstract class Duck {

    public void quack(){
        System.out.println("gua gua");
    }

    public void swim(){
        System.out.println("common swim");
    }

    public void fly(){
        System.out.println("fly fly");
    }

    public abstract void display();

    public void behavior(){
        display();
        quack();
        swim();
        fly();
    }
}
