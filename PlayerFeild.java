import java.awt.Font;

import javax.swing.JTextField;

public class PlayerFeild extends JTextField{
    Font font = new Font(Font.SERIF, CENTER, 35);
    Game game;
    public PlayerFeild(Game game) {
        this.game = game;
        this.setFont(font);
        this.setEditable(false);
        this.setOpaque(false);
        this.setBorder(null);
        this.setText(String.format("%s's score: %d",this.game.getPlayerName(), game.getPlayerScore()));
    }

    public void update(){
        if(this.game.getPlayerScore() >21){
            this.setText(String.format("%s busted", this.game.getPlayerName()));
        }
        else{
            this.setText(String.format("%s's score: %d",this.game.getPlayerName(), game.getPlayerScore()));
        }
    }
}