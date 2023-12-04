package Weapons;

public abstract class Weapon {
    protected int damage;
    protected double dodgeChance;

    protected Weapon(int damage, double dodgeChance) {
        this.damage = damage;
        this.dodgeChance = dodgeChance;
    }

    public int getDamage() {
        return damage;
    }

    public double getDodgeChance() {
        return dodgeChance;
    }
}
