package org.potter.strategy.pattern;

public class CanNotFlyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("My color is yellow");
    }

    @Override
    public void setQuackBehavior(QuackableInterface quackBehavior) {
        super.setQuackBehavior(quackBehavior);
    }

    @Override
    public void setFlyBehavior(FlyableInterface flyBehavior) {
        super.setFlyBehavior(flyBehavior);
    }

}
