package com.company;


public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbilityType;

    public abstract void setSuperAbilityType();
}
