import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;
import java.awt.Graphics;


public class HitButton extends JButton{
    GamePanel panel;
    Game game;
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    int incramentor = 0;
    public HitButton(GamePanel panel, Game game){
        this.panel = panel;
        this.game = game;
        this.setText("HIT ME!");
        this.setFont(font);
        this.setSize(100,200);
        this.addActionListener(e -> press());
    }
    
    private void press() {
        if (!this.game.isGameOver()) {
            game.updatePlayerScore(panel.getPlayerDrawnCard());
            if (game.checkPlayerBusted()) {
                this.panel.getDealerFeild().update();
                this.panel.getPlayerFeild().update();
            }
            this.panel.getPlayerFeild().update();
            this.panel.getPlayerDrawnIcon().setImage(panel.getPlayerDrawnCard().getCardFace().getImage());
            this.panel.repaint();
            if (game.dealerWillHit()) {
                this.game.updateDealerScore(panel.dealerHit());
                this.panel.getDealerFeild().update();
                this.panel.getDealerDrawnIcon().setImage(panel.getDealerDrawnCard().getCardFace().getImage());
            }
        }


        if(this.game.isGameOver() && incramentor == 0){
            incramentor ++;
        }
        else if(this.game.isGameOver() && incramentor != 0){
            System.exit(0);
        }
        else{
            game.dealerCheck();
            
        }
    }
}
