package coding_playground_Java.ScoreboardChallenge;

public class ScoreConsoleApp {
    
public static void main(String[] args) {
    Player player1 = new Player("Paul Mathia");
    Player player2 = new Player("Gigi Tejera");
    Player player3 = new Player("John Cocker");
    Player player4 = new Player("Matteo Rault");

    Scoreboard scoreboard = new Scoreboard();

    player1.addPoints(200);
    player2.addPoints(250);

    scoreboard.addPlayerToList(player1);
    scoreboard.addPlayerToList(player2);


    scoreboard.addPointsToPlayer(player1, 250);
    scoreboard.addPlayerToList(player3);
    scoreboard.addPlayerToList(player4);

    scoreboard.addPointsToPlayer(player3, 550);
    scoreboard.addPointsToPlayer(player4, 1);
}

}