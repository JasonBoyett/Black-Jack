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

public class StayButton extends JButton {
    Game game;
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    GamePanel panel;
    int cardsDrawnByDealer;

    public StayButton(Game game, GamePanel panel) {
        this.game = game;
        this.panel = panel;
        this.setFont(font);
        this.setText("I'll Stay");
        this.addActionListener(e -> press());
    }

    private void press() {
        this.cardsDrawnByDealer = this.panel.getHitButton().getCardsDrawnByDealer();
        if (!this.panel.getGame().isGameOver()) {
            this.game.playerChecks();
            panel.getPlayerFeild().update();
            panel.getDealerFeild().update();
            if (game.dealerWillHit()) {
                panel.repaint();
            }
            while (this.game.dealerWillHit()) {
                this.game.getDealerHand().add(this.cardsDrawnByDealer, game.getGameDeck().drawCard());
                this.cardsDrawnByDealer++;
                this.game.updateDealerScore();
                this.panel.getCenterFeild().update();
                panel.repaint();
            }
            panel.getPlayerFeild().update();
            panel.getDealerFeild().update();
            panel.getCenterFeild().update();
        } else if (this.panel.getGame().isGameOver()) {// reset the state of the GUI
            this.panel.getGame().newHand();
            this.panel.getHitButton().setCardsDrawnByDealer(2);
            this.panel.getHitButton().setCardsDrawnByPlayer(2);
            GUI.gamePanel = new GamePanel(this.panel.getGame());
            this.panel.getPlayerFeild().update();
            this.panel.getDealerFeild().update();
            this.panel.getCenterFeild().update();
            this.setText("I'll Stay");
            this.panel.getHitButton().setText("Hit Me!");
            this.panel.repaint();
        }
    }
}