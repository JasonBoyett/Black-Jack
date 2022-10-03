/*
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * October 2, 2022
 * mac OS
 */
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

import src.GUI;
import src.Game;

public class Main {
private static String playerName;
    public static void main(String[] args) throws FileNotFoundException{
        playerName = JOptionPane.showInputDialog(null, "What is your name?");
        Game theGame = new Game(playerName);
        GUI gui = new GUI(theGame);
        gui.setVisible(true);
    }
}