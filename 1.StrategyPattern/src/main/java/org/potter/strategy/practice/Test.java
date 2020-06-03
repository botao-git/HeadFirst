package org.potter.strategy.practice;

import org.potter.strategy.common.Constant;

public class Test {
    public static void main(String[] args) {
        King king = new King();
        king.display();
        Sword sword = new Sword();
        king.setWeapon(sword);
        king.fight();

        System.out.println(Constant.LINE_SEPARATOR);


        Queen queen = new Queen();
        queen.display();
        Knife knife = new Knife();
        queen.setWeapon(knife);
        queen.fight();
        System.out.println(Constant.LINE_SEPARATOR);

        Knight knight = new Knight();
        knight.display();
        BowAndArrow bowAndArrow = new BowAndArrow();
        knight.setWeapon(bowAndArrow);
        knight.fight();
        System.out.println(Constant.LINE_SEPARATOR);

        Troll troll = new Troll();
        troll.display();
        Axe axe = new Axe();
        troll.setWeapon(axe);
        troll.fight();
        System.out.println(Constant.LINE_SEPARATOR);



    }
}
