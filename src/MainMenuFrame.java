import javax.swing.*;
import java.awt.*;

public class MainMenuFrame extends JFrame {
    private Player currentPlayer;

    public MainMenuFrame(Player player) {
        this.currentPlayer = player;
        setTitle("Main Menu - Welcome " + player.getUsername());
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10));

        JButton btnStartGame = new JButton("Start Game");
        JButton btnStatistics = new JButton("View My Statistics");
        JButton btnTopScorers = new JButton("View Top 5 Scorers");
        JButton btnExit = new JButton("Exit");

        add(btnStartGame);
        add(btnStatistics);
        add(btnTopScorers);
        add(btnExit);

        btnStartGame.addActionListener(e -> {
            new GameFrame(currentPlayer).setVisible(true);
            this.dispose();
        });

        btnStatistics.addActionListener(e -> new StatisticsFrame(currentPlayer).setVisible(true));
        btnTopScorers.addActionListener(e -> new TopScorersFrame().setVisible(true));
        btnExit.addActionListener(e -> System.exit(0));
    }
}