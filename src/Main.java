public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", "usp");
        Player player2 = new Player("Player2", "sniper");
        Game game = new Game(player1, player2);

        game.start();
    }
}