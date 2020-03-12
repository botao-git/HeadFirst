package org.potter.decorator;

import org.junit.Test;
import org.potter.decorator.nice.*;

public class StarbuzzCoffeeTest {

    @Test
    public void test(){
        // 单独一杯浓缩开发，不加奶泡等调料
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + "  $" + espresso.cost()); // 显示浓缩咖啡信息

        // 黑咔 + 豆浆
        Beverage houseBlend = new HouseBlend();
        Soy soy = new Soy(houseBlend);
        System.out.println(soy.getDescription() + "  $"+soy.cost());

        // 黑咔 + 摩卡 + 奶泡
        Beverage houseBlend2 = new HouseBlend();
        Mocha mocha = new Mocha(houseBlend2);
        Whip whip = new Whip(mocha);
        System.out.println(whip.getDescription() + "  $" + whip.cost());
    }
}
