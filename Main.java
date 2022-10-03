/*
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * October 2, 2022
 * mac OS
 */
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

import src.Deck;
import src.GUI;
import src.Game;

public class Main {
private static String playerName;
    public static void main(String[] args) throws FileNotFoundException{
        playerName = String.valueOf(JOptionPane.showInputDialog(null, "What's your name?", "Black Jack", JOptionPane.DEFAULT_OPTION, Deck.scaleImageIcon("assets/startIcon.png", 100, 100), null, "Player"));
        if(playerName == null){
            System.exit(0);
        }
        else{
            Game theGame = new Game(playerName);
            GUI gui = new GUI(theGame);
            gui.setVisible(true);
        }
    }
}