import javax.swing.JButton;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;

public class StayButton extends JButton{
    Game game;
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    PlayerFeild pf;
    public StayButton(Game game, PlayerFeild pf) {
        this.game = game;
        this.pf = pf;
        this.setFont(font);
        this.setText("I'll Stay");
        this.addActionListener(e -> press());
    }

    private void press(){
        this.game.playerChecks();
        pf.update();
        System.out.println("stay\n");
        game.playerScore++;
        System.out.println(game.playerScore);
        
    }

}
