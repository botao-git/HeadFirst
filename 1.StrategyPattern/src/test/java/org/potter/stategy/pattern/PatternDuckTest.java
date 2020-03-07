package org.potter.stategy.pattern;

import org.junit.Test;
import org.potter.strategy.common.Constant;
import org.potter.strategy.pattern.*;

public class PatternDuckTest {

    @Test
    public void canNotFlyDuckTest(){
        CanNotFlyDuck canNotFlyDuck = new CanNotFlyDuck();
        canNotFlyDuck.display();
        canNotFlyDuck.setFlyBehavior(new CanNotFly());
        canNotFlyDuck.setQuackBehavior(new CommonQuack());
        canNotFlyDuck.behaviour();
        System.out.println(Constant.LINE_SEPARATOR);
    }

    @Test
    public void rocketFlyTest(){
        RocketDuck rocketDuck = new RocketDuck();
        rocketDuck.display();
        rocketDuck.setFlyBehavior(new RocketFly());
        rocketDuck.setQuackBehavior(new CommonQuack());
        rocketDuck.behaviour();
        System.out.println(Constant.LINE_SEPARATOR);
    }
}
