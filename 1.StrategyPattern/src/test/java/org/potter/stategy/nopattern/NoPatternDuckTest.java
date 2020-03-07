package org.potter.stategy.nopattern;

import org.junit.Test;
import org.potter.strategy.common.Constant;
import org.potter.strategy.nopattern.CanNotFlyDuck;
import org.potter.strategy.nopattern.GreenDuck;
import org.potter.strategy.nopattern.RedDuck;

public class NoPatternDuckTest {
    @Test
    public void testGreenQuack(){
        GreenDuck greenDuck = new GreenDuck();
        greenDuck.behavior();
        System.out.println(Constant.LINE_SEPARATOR);
    }

    @Test
    public void testRedQuck(){
        RedDuck redDuck = new RedDuck();
        redDuck.behavior();
        System.out.println(Constant.LINE_SEPARATOR);
    }

    @Test
    public void testCanNotFlyDuck(){
        CanNotFlyDuck canNotFlyDuck = new CanNotFlyDuck();
        canNotFlyDuck.behavior();
        System.out.println(Constant.LINE_SEPARATOR);
    }

}
