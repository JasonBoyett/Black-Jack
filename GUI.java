import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.ColorUIResource;

public class GUI extends JFrame{

    Deck gameDeck;
    GamePanel gamePanel;
    public GUI(Game theGame) {
        this.gamePanel = new GamePanel(theGame);
        this.setResizable(false);
        this.gameDeck = gameDeck;
        this.setVisible(true);
        this.add(gamePanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
}