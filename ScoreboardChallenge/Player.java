package coding_playground_Java.ScoreboardChallenge;

public class Player implements Comparable<Player> {

    // attributes
    private final String _name;
    private int _points;

    // no magic numbers
    private final int initPoints = 0;

    // Constructor
    public Player(final String name) {
        _name = name;
        _points = initPoints;
    }

    public String getName() {
        return _name;
    }

    public int getPoints() {
        return _points;
    }

    public void addPoints(final int points) {
        _points += points;
    }

    public void printPlayerInfo() {
        final String playerInfo = "Player: " + _name + " has " + _points + " points.";
        System.out.println(playerInfo);
    }

    @Override
    public String toString() {
        return "Player " + _name + ", has " + _points + " points";
    }

    @Override
    public int compareTo(Player player2) {
        if(this.getPoints() < player2.getPoints()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
