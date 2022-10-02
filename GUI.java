import javax.swing.JFrame;

public class GUI extends JFrame{

    GamePanel gamePanel;
    public GUI(Game theGame) {
        this.gamePanel = new GamePanel(theGame);
        this.setResizable(true);
        this.setVisible(true);
        this.add(gamePanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
}