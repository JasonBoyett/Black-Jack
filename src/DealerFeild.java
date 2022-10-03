/*
* Jason Boyett - jaboye2448
* CIT 4423 01
* October 2, 2022
* mac OS
*/
package src;

import java.awt.Font;
import javax.swing.JTextField;

public class DealerFeild extends JTextField {
    Game game;
    Font font = new Font(Font.SERIF, CENTER, 35);

    public DealerFeild(Game game) {
        this.game = game;
        this.setFont(font);
        this.setText(String.format("Dealer's score: %d", game.getDealerScore()));
        this.setBounds(60, 350, 300, 100);
        this.setOpaque(false);
        this.setBorder(null);
        this.setEditable(false);
    }

    public void update() {
        if (this.game.getDealerScore() == 21) {
            this.setText("Black Jack");
        } else if ((this.game.checkDealerBusted())) {
            this.setText("Dealer busted");
        } else {
            this.setText(String.format("Dealer's score: %d", game.getDealerScore()));
        }
    }
}