package org.potter.strategy.pattern;

public abstract class Duck {
    QuackableInterface quackBehavior;
    FlyableInterface flyBehavior;

    public void swim(){
        System.out.println("all duck can swim");
    }

    public void setQuackBehavior(QuackableInterface quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyableInterface flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void behaviour(){
        quackBehavior.quack();
        flyBehavior.fly();
    }

}
