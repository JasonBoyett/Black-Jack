import javax.swing.JButton;
import javax.swing.plaf.FontUIResource;

import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

public class StayButton extends JButton{
    Game game;
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    GamePanel panel;
    Timer timer = new Timer();
    TimerTask task = new TimerTask(){
        @Override
        public void run() {
            panel.getDealerFeild().update();
            panel.repaint();
        }
    };
    public StayButton(Game game, GamePanel panel) {
        this.game = game;
        this.panel = panel;
        this.setFont(font);
        this.setText("I'll Stay");
        this.addActionListener(e -> press());
    }

    private void press(){
        this.game.playerChecks();
        panel.getPlayerFeild().update();
        panel.getDealerFeild().update();
        while(this.game.dealerWillHit()){
            Card tempCard = panel.dealerHit();
            panel.getDealerDrawnIcon().setImage(tempCard.getCardFace().getImage());
            timer.schedule(task, 1500);
        }
        panel.getPlayerFeild().update();
        panel.getDealerFeild().update();
        
    }

}