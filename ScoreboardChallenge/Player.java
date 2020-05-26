package coding_playground_Java.ScoreboardChallenge;

public class Player {

    //attributes
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

    public String printPlayerInfo() {
        final String playerInfo = "Player: " + _name + " has " + _points + " points.";
        System.out.println(playerInfo);
        return playerInfo;
    }
}
