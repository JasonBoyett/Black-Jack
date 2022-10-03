/*
* Jason Boyett - jaboye2448
* CIT 4423 01
* October 2, 2022
* mac OS
*/
package src;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.plaf.FontUIResource;


public class HitButton extends JButton{
    GamePanel panel;
    Game game;
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    int incramentor = 0;
    int cardsDrawnByPlayer = 2;
    int cardsDrawnByDealer = 2;
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
            game.getPlayerHand().add(cardsDrawnByPlayer, game.getGameDeck().drawCard());
            this.game.getPlayerHand().remove(5);
            game.updatePlayerScore();
            this.panel.getCenterFeild().update();
            panel.repaint();
            cardsDrawnByPlayer ++;
            if (game.checkPlayerBusted()) {
                this.panel.getDealerFeild().update();
                this.panel.getPlayerFeild().update();
                this.panel.getCenterFeild().update();
                panel.repaint();
            }
            this.panel.getPlayerFeild().update();
            this.panel.getCenterFeild().update();
            this.panel.repaint();
            if (game.dealerWillHit()) {
                this.game.getDealerHand().add(cardsDrawnByDealer, this.game.getGameDeck().drawCard());
                this.game.getDealerHand().remove(5);
                this.game.updateDealerScore();
                cardsDrawnByDealer++;
                this.panel.getDealerFeild().update();
                this.panel.getCenterFeild().update();
                panel.repaint();
            }
        }
        else if(this.game.isGameOver()){
            System.exit(0);
        }
        else{
            game.dealerCheck();
            
        }
    }

    public int getCardsDrawnByDealer(){
        return this.cardsDrawnByDealer;
    }

    public void setCardsDrawnByDealer(int cardsDrawnByDealer){
        this.cardsDrawnByDealer = cardsDrawnByDealer;
    }

    public void setCardsDrawnByPlayer(int number){
        this.cardsDrawnByPlayer = number;
    }
}