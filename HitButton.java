import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;


public class HitButton extends JButton{
    GamePanel panel;
    Game game;
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    public HitButton(GamePanel panel, Game game){
        this.panel = panel;
        this.game = game;
        this.setText("HIT ME!");
        this.setFont(font);
        this.setSize(100,200);
        this.addActionListener(e -> press());
    }
    
    private void press(){
        game.updatePlayerScore(panel.getPlayerDrawnCard());
        panel.getPlayerFeild().update();
    }
}
