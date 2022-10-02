import javax.swing.JButton;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

public class StayButton extends JButton{
    Game game;
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    GamePanel panel;
    int cardsDrawnByDealer;

    public StayButton(Game game, GamePanel panel) {
        this.game = game;
        this.panel = panel;
        this.cardsDrawnByDealer = this.panel.getHitButton().getCardsDrawnByDealer();
        this.setFont(font);
        this.setText("I'll Stay");
        this.addActionListener(e -> press());
    }

    private void press(){
        this.game.playerChecks();
        panel.getPlayerFeild().update();
        panel.getDealerFeild().update();
        if(game.dealerWillHit()){

        }
        while(this.game.dealerWillHit()){
            this.game.getDealerHand().add(cardsDrawnByDealer, game.getGameDeck().drawCard());
            this.game.updateDealerScore();
            panel.repaint();
        }
        panel.getPlayerFeild().update();
        panel.getDealerFeild().update();
        
    }

}