package org.potter.decorator.nice;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso"; //浓缩咖啡
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
