import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StayButton extends JButton{
    Game game;
    public StayButton(Game game) {
        this.game = game;
        this.setText("Stay");
        this.addActionListener(e -> press());
    }

    private void press(){
        this.game.playerChecks();
        System.out.println("stay");
    }

}
