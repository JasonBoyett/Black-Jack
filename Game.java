import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class Game {
    Deck gameDeck;
    JFrame gameFrame;
    int playerScore = 0;
    int dealerScore = 0;
    private boolean dealerCheck = false;
    private boolean playerCheck = false;

    public Game(int cardWidth, int cardHeight) {
        try {
            gameDeck = new Deck(cardHeight, cardWidth);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updatePlayerScore(Card playerFirstCard, Card playerSecondCard){
        this.playerScore = playerFirstCard.getValue() + playerSecondCard.getValue();
    }

    public void updatePlayerScore(Card drawnCard){
        this.playerScore += drawnCard.getValue();
    }

    public void updateDealerScore(Card firstCard, Card secondCard) {
        this.dealerScore = firstCard.getValue() + secondCard.getValue();
    }

    public void updateDealerScore(Card drawnCard){
        this.dealerScore += drawnCard.getValue();
    }

    public boolean checkPlayerBusted(){
        if(playerScore > 21){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean checkDealerBusted(){
        if(dealerScore > 21){
            return true;
        }
        else{
            return false;
        }
    }

    public Deck getGameDeck(){
        return this.gameDeck;
    }

    public boolean playerWon(){//the player will lose if both the dealer and the house bust so the house has an edge
        if(this.checkPlayerBusted()){
            return false;
        }
        else if(this.checkDealerBusted()){
            return true;
        }
        else if(this.playerScore > this.dealerScore){
            return true;
        }
        else{
            return false;
        }
    }

    public void playerChecks(){
        this.playerCheck = true;
    }

    public void dealerCheck(){
        this.dealerCheck = true;
    }

    public boolean isGameOver(){
        if(playerCheck && dealerCheck){
            return true;
        }
        else if(checkDealerBusted() || checkPlayerBusted()){
            return true;
        }
        else{
            return false;
        }
    }
}
