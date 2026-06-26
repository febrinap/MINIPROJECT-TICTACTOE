import javax.swing.*;
import java.awt.*;

public class StatisticsFrame extends JFrame {
    public StatisticsFrame(Player player) {
        PlayerService service = new PlayerService();
        Player freshData = service.getPlayerById(player.getId());
        Player p = (freshData != null) ? freshData : player;

        setTitle("My Statistics");
        setSize(250, 200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1, 5, 5));

        add(new JLabel(" Username: " + p.getUsername()));
        add(new JLabel(" Wins: " + p.getWins()));
        add(new JLabel(" Losses: " + p.getLosses()));
        add(new JLabel(" Draws: " + p.getDraws()));
        add(new JLabel(" Total Score: " + p.getScore()));
    }
}