package coding_playground_Java.ScoreboardChallenge;

public class ScoreConsoleApp {
    
public static void main(String[] args) {
    Player player1 = new Player("Paul Mathia");
    Player player2 = new Player("Gigi Tejera");

    player1.addPoints(200);
    player2.addPoints(250);

    player1.printPlayerInfo();
    player2.printPlayerInfo();

    player1.addPoints(200);
    player1.printPlayerInfo();
    player2.printPlayerInfo();
}

}