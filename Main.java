import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class Main {

private static String playerName;
    public static void main(String[] args) throws FileNotFoundException{
        playerName = JOptionPane.showInputDialog(null, "What is your name?");
        Game theGame = new Game(playerName);
        GUI gui = new GUI(theGame);
        gui.setVisible(true);
    }

}
