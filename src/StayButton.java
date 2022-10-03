package src;
/*
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * October 2, 2022
 * mac OS
 */
import javax.swing.JButton;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;

public class StayButton extends JButton{
    Game game;
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    GamePanel panel;

    public StayButton(Game game, GamePanel panel) {
        this.game = game;
        this.panel = panel;
        this.setFont(font);
        this.setText("I'll Stay");
        this.addActionListener(e -> press());
    }

    private void press() {
        if (!this.panel.getGame().isGameOver()) {
            this.game.playerChecks();
            panel.getPlayerFeild().update();
            panel.getDealerFeild().update();
            if (game.dealerWillHit()) {
                panel.repaint();
            }
            while (this.game.dealerWillHit()) {
                this.game.getDealerHand().add(this.panel.getHitButton().getCardsDrawnByDealer(),game.getGameDeck().drawCard());
                this.panel.getHitButton().setCardsDrawnByDealer(this.panel.getHitButton().getCardsDrawnByDealer() + 1);
                this.game.updateDealerScore();
                this.panel.getCenterFeild().update();
                panel.repaint();
            }
            panel.getPlayerFeild().update();
            panel.getDealerFeild().update();
            panel.getCenterFeild().update();
        }
        else if (this.panel.getGame().isGameOver()){
            this.panel.getGame().newGame();
            GUI.gamePanel = new GamePanel(this.panel.getGame());
            this.panel.getPlayerFeild().update();
            this.panel.getDealerFeild().update();
            this.panel.repaint();
        }
    }
}