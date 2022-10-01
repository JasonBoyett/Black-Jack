import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;


public class GamePanel extends JPanel{
    
    private ImageIcon deck;
    private Deck gameDeck;
    private Card playerCardFirst;
    private Card playerCardSecond;
    private Card playerDrawnCard;
    private Card dealerDrawnCard;
    private Card dealerCardFirst;
    private Card dealerCardSecond;
    private HitButton hitButton;
    private StayButton stayButton;
    private Game game;
    private PlayerFeild playerFeild;
    private DealerFeild dealerFeild;

    public GamePanel(Game game){
        this.game = game;
        this.playerFeild = new PlayerFeild(game);
        this.dealerFeild = new DealerFeild(game);
        this.playerFeild.setBounds(500,275,300,100);
        this.gameDeck = game.getGameDeck();
        this.hitButton = new HitButton(this,game);
        this.stayButton = new StayButton(game, playerFeild);
        this.setLayout(null);
        this.setBackground(new ColorUIResource(0, 102, 20));
        this.setPreferredSize(new DimensionUIResource(1280,720));
        deck = gameDeck.getBackImage();
        this.playerCardFirst = gameDeck.drawCard();
        this.playerCardSecond = gameDeck.drawCard();
        this.dealerCardFirst = gameDeck.drawCard();
        this.dealerCardSecond = gameDeck.drawCard();
        this.hitButton.setBounds(1075,325,150,50);
        this.stayButton.setBounds(1075,385, 150, 50);
        this.add(this.hitButton);
        this.add(this.stayButton);
        this.add(this.dealerFeild);
        this.add(this.playerFeild);
        game.updateDealerScore(dealerCardFirst, dealerCardSecond);
        game.updatePlayerScore(playerCardFirst, playerCardSecond);
        if(game.getPlayerScore() == 21){
            playerFeild.setText(String.format("%s got a Black Jack!", game.getPlayerName()));
            dealerFeild.update();
        }
        else if(game.getDealerScore() == 21){
            dealerFeild.setText("Dealer Got a Black Jack");
        }
        else{
            playerFeild.update();
            dealerFeild.update();
        }


    }

    public void playerHit(){
        this.playerDrawnCard = this.gameDeck.drawCard();
        this.game.updatePlayerScore(this.playerDrawnCard);
    }

    public void dealerHit(){
        this.dealerDrawnCard = this.gameDeck.drawCard();
        this.game.updateDealerScore(dealerDrawnCard);
        if(this.game.checkDealerBusted()){
            //TODO set bust sign over dealer to visible
            //TODO set text feild over player's cards to winner
        }
    }

    // public void paint(java.awt.Graphics g) {
	// 	super.paint(g);
    //     Graphics2D playerCard = (Graphics2D) g;
    //     playerCard.drawImage(this.dealerCardFirst.getCardFace().getImage(),10, 10,null);
	// }

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        this.hitButton.paintComponents(g);
        this.playerFeild.paintComponents(g);
        deck.paintIcon(this, g, 1070, 10);
        this.dealerCardFirst.getCardFace().paintIcon(this, g,10,10);
        this.dealerCardSecond.getCardFace().paintIcon(this, g,50,50);
        this.playerCardFirst.getCardFace().paintIcon(this, g,500,370);
        this.playerCardSecond.getCardFace().paintIcon(this, g, 540, 400);
    }

    public Card getPlayerDrawnCard() {
        this.playerDrawnCard = this.gameDeck.drawCard();
        return this.playerDrawnCard;
    }

    public PlayerFeild getPlayerFeild() {
        return this.playerFeild;
    }

    public DealerFeild getDealerFeild() {
        return this.dealerFeild;
    }
}
