import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

public class GamePanel extends JPanel implements ActionListener{
    private Image deck;
    Deck gameDeck;
    private Card playerCardFirst;
    private Card playerCardSecond;
    private Card playerCardDraw;
    private Card dealerCardFirst;
    private Card dealerCardSecond;
    HitButton hitButton;
    StayButton stayButton;

    public GamePanel(Game theGame){
        this.gameDeck = theGame.getGameDeck();
        this.hitButton = new HitButton();
        this.stayButton = new StayButton(theGame);
        this.setLayout(null);
        this.setBackground(new ColorUIResource(0, 102, 20));
        this.setPreferredSize(new DimensionUIResource(1280,720));
        deck = gameDeck.getBackImage().getImage();
        this.playerCardFirst = gameDeck.drawCard();
        this.playerCardSecond = gameDeck.drawCard();
        this.dealerCardFirst = gameDeck.drawCard();
        this.dealerCardSecond = gameDeck.drawCard();
        this.hitButton.setBounds(1075,325,150,50);
        this.stayButton.setBounds(1075,385, 150, 50);
        this.add(this.hitButton);
        this.add(this.stayButton);


    }

    public void playerDraw(){
        this.playerCardDraw = this.gameDeck.drawCard();
    }

    // public void paint(java.awt.Graphics g) {
	// 	super.paint(g);
    //     Graphics2D playerCard = (Graphics2D) g;
    //     playerCard.drawImage(this.dealerCardFirst.getCardFace().getImage(),10, 10,null);
	// }

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        this.hitButton.paintComponents(g);
        ImageIcon deckBack = gameDeck.getBackImage();
        deckBack.paintIcon(this, g, 1070, 10);
        this.dealerCardFirst.getCardFace().paintIcon(this, g,10,10);
        this.dealerCardSecond.getCardFace().paintIcon(this, g,50,50);
        this.playerCardFirst.getCardFace().paintIcon(this, g,500,370);
        this.playerCardSecond.getCardFace().paintIcon(this, g, 540, 400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
