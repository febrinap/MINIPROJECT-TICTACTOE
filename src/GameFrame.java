import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    private Player currentPlayer;
    private PlayerService playerService;
    private GameLogic gameLogic;
    private JButton[] buttons;

    public GameFrame(Player player) {
        this.currentPlayer = player;
        this.playerService = new PlayerService();
        this.gameLogic = new GameLogic();

        setTitle("Tic-Tac-Toe Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3));

        buttons = new JButton[9];
        for (int i = 0; i < 9; i++) {
            final int index = i;
            buttons[i] = new JButton("");
            buttons[i].setFont(new Font("Arial", Font.BOLD, 40));
            buttons[i].addActionListener(e -> handlePlayerMove(index));
            add(buttons[i]);
        }
    }

    private void handlePlayerMove(int index) {
        if (gameLogic.makeMove(index, 'X')) {
            buttons[index].setText("X");

            if (gameLogic.checkWinner('X')) {
                finishGame("WIN");
                return;
            }
            if (gameLogic.isDraw()) {
                finishGame("DRAW");
                return;
            }

            int compIndex = gameLogic.computerMove();
            if (compIndex != -1) {
                gameLogic.makeMove(compIndex, 'O');
                buttons[compIndex].setText("O");

                if (gameLogic.checkWinner('O')) {
                    finishGame("LOSE");
                    return;
                }
                if (gameLogic.isDraw()) {
                    finishGame("DRAW");
                    return;
                }
            }
        }
    }

    private void finishGame(String result) {
        playerService.updateStatistics(currentPlayer, result);
        JOptionPane.showMessageDialog(this, "Game Over! Result: " + result);
        Player refreshedPlayer = playerService.getPlayerById(currentPlayer.getId());
        new MainMenuFrame(refreshedPlayer != null ? refreshedPlayer : currentPlayer).setVisible(true);
        this.dispose();
    }
}