package org.potter.strategy.pattern;

public class CommonQuack implements QuackableInterface {
    @Override
    public void quack() {
        System.out.println("common quack: gua gua");
    }
}
