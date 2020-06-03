package org.potter.strategy.practice;

/**
 * 角色类
 * 这是抽象类，由具体的角色来继承
 * 具体的角色包括：King Queen Knight Troll
 */
public abstract class Character {
    Weapon weapon;

    public abstract void display();

    void fight(){
        weapon.useWeapon();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
