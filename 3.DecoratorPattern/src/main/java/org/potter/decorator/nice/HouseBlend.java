package org.potter.decorator.nice;

/**
 * HouseBlend 黑咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee"; //黑咖啡
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
