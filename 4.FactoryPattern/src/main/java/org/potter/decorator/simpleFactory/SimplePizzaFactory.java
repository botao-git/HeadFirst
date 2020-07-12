package org.potter.decorator.simpleFactory;

import org.potter.decorator.bad.CheesePizza;
import org.potter.decorator.bad.GreekPizza;
import org.potter.decorator.bad.Pizza;

public class SimplePizzaFactory {

    /**
     * 这个方法通常声明为静态的
     * @param type
     * @return
     */
    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("greek")){
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
