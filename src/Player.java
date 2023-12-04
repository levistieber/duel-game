import Weapons.*;

public class Player {
    private int hp = 100;
    private String name;
    private Weapon weapon;

    public Player(String name, String weapon) {
        this.name = name;
        this.weapon = chooseWeapon(weapon);
    }

    private Weapon chooseWeapon(String weapon) {
        return switch (weapon) {
            case "revolver" -> new Revolver();
            case "uzi" -> new Uzi();
            case "sniper" -> new Sniper();
            case "ak" -> new AK();
            case "usp" -> new USP();
            default -> new Fist();
        };
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Player enemy, int multiplier) {
        enemy.setHp(enemy.getHp() - multiplier * this.weapon.getDamage());
    }
}
