package src;
/*
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * October 2, 2022
 * mac OS
 */
import java.awt.Font;
import javax.swing.JTextField;

public class CenterFeild extends JTextField{
    Font font = new Font(Font.SERIF, CENTER, 35);
    GamePanel panel;
    public CenterFeild(GamePanel panel) {
        this.panel = panel;
        this.setBounds(380, 125, 400, 100);
        this.setText("");
        this.setFont(font);
        this.setHorizontalAlignment(CenterFeild.CENTER);
        this.setEditable(false);
        this.setOpaque(false);
        this.setBorder(null);
    }

    public void update(){
        if(this.panel.getGame().playerWon()){
            this.setText(String.format("%s wins!", this.panel.getGame().getPlayerName()));
            this.panel.getHitButton().setText("Exit");
            this.panel.getStayButton().setText("Play Again");
        }
        else if((!this.panel.getGame().playerWon()) && (this.panel.getGame().isGameOver())){
            this.setText("Dealer wins");
            this.panel.getHitButton().setText("Exit");
            this.panel.getStayButton().setText("Play Again");
        }
    }
}