import java.io.FileNotFoundException;

public class Main {
private static int CARD_WIDTH = 200;
private static int CARD_HEIGHT = 300;
    public static void main(String[] args) throws FileNotFoundException{
        Game theGame = new Game(CARD_WIDTH, CARD_HEIGHT);
        GUI gui = new GUI(theGame);
        gui.setVisible(true);
    }
    
}
