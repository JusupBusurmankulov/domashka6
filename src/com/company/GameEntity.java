package com.company;

public class GameEntity {
    private int healthEntity;
    private int damageEntity;



    public int getHealthEntity() {
        return healthEntity;
    }

    public void setHealthEntity(int healthEntity) {
        this.healthEntity = healthEntity;
    }

    public int getDamageEntity() {
        return damageEntity;
    }

    public void setDamageEntity(int damageEntity) {
        this.damageEntity = damageEntity;
    }


    public String info() {
        return "Health: " + this.healthEntity + " Damage: " + this.damageEntity;
    }

}
