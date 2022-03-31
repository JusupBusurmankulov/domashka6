package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
    boss.setHealthEntity(900);
    boss.setDamageEntity(100);
    boss.setWeaponToBoss("Ak-47");
        System.out.println(boss.getHealthEntity()+" "+ boss.getDamageEntity()+" "+ boss.getWeaponToBoss());

    }
}
