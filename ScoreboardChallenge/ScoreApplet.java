package coding_playground_Java.ScoreboardChallenge;
import javax.swing.*;
import java.awt.*;

public class ScoreApplet {

    public ScoreApplet() {
        JFrame frame = new JFrame();

        JButton addPointsButton = new JButton("Add Points");
        JButton addPlayerButton = new JButton("Add Player");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(addPointsButton);
        panel.add(addPlayerButton);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Score Applet");
        frame.pack();
        frame.setVisible(true);

    }
    
    public static void main(String[] args) {
        new ScoreApplet();
    }

}