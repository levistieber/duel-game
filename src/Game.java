public class Game {
    private Player player1;
    private Player player2;
    private LuckFactor luckFactor = new LuckFactor();

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        boolean firstRound = true;

        while (player1.getHp() > 0 && player2.getHp() > 0) {
            if ((firstRound && Math.random() > 0.5) || !firstRound) {
                attackRound(player1, player2);
            }
            if (player2.getHp() <= 0) {
                System.out.println(player1.getName() + " won");
                break;
            }

            firstRound = false;
            attackRound(player2, player1);
            if (player1.getHp() <= 0) {
                System.out.println(player2.getName() + " won");
                break;
            }
        }
    }

    private void attackRound(Player attacker, Player target) {
        if (target.getHp() > 0) {
            if (!luckFactor.dodged(target.getWeapon().getDodgeChance())) {
                int multiplier = luckFactor.rollTheDie();
                attacker.attack(target, multiplier);
                System.out.println(target.getName() + " got hit. remaining hp: " + target.getHp());
            } else {
                System.out.println(target.getName() + " dodged. Remaining hp: " + target.getHp());
            }
        }
    }
}
