package com.company;

public class Main {

    public static void main(String[] args) {

        Weapon weaponToBoss = new Weapon();
        weaponToBoss.setNameGun("водяной пистолет");

	Boss boss = new Boss();
    boss.setHealthEntity(900);
    boss.setDamageEntity(100);
    boss.setWeapon(weaponToBoss);

        System.out.println(boss.printInfo());




    }
}
