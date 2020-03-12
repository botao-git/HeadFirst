package org.potter.decorator.nice;

/**
 * Mocha 是 一个装饰者，所以让它"扩展"自CondimentDecorator（CondimentDecorator"扩展"自Beverage）
 *
 * 1. 这里强调用的是扩展而不是继承，用意于提醒为了得到同一种类型，而不是为了继承某些属性或方法
 *
 * 2. 要让Mocha能够引用一个Beverage
 *
 * 3. 想办法让被装饰者被记录到实力变量中
 *
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha"; // 在CondimentDecorator 中声明此抽象方法的用意，在于让其实现者，详细描述完整的调料信息
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost(); // 调用委托给被装饰对象的价格结果 然后加上自身的价格
    }
}
