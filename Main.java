import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class Main {
private static int CARD_WIDTH = 200;
private static int CARD_HEIGHT = 300;
private static String playerName;
    public static void main(String[] args) throws FileNotFoundException{
        playerName = JOptionPane.showInputDialog(null, "What is your name?");
        Game theGame = new Game(CARD_WIDTH, CARD_HEIGHT,playerName);
        GUI gui = new GUI(theGame);
        gui.setVisible(true);
    }

}
