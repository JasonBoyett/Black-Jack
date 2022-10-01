import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class Game {
    Deck gameDeck;
    JFrame gameFrame;
    int playerScore = 0;
    int dealerScore = 0;
    private boolean dealerCheck = false;
    private boolean playerCheck = false;
    private String playerName;

    public Game(int cardWidth, int cardHeight, String playerName) {
        try {
            gameDeck = new Deck(cardHeight, cardWidth);
            this.playerName = playerName;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updatePlayerScore(Card playerFirstCard, Card playerSecondCard){
        if((playerFirstCard.getValue() == playerSecondCard.getValue()) && (playerFirstCard.getValue() == 11)) {//this if statement stops the player from busting by drawing two aces
            this.playerScore = 12;
        }
        else{
            this.playerScore = playerFirstCard.getValue() + playerSecondCard.getValue();
        }
    }

    public void updatePlayerScore(Card drawnCard){
        if((drawnCard.getValue() == 11) && playerScore < 10){//this if statement lets an ace be 1 if the player would bust with 11
            this.playerScore ++;
        }
        else{
            this.playerScore += drawnCard.getValue();
        }
    }

    public void updateDealerScore(Card firstCard, Card secondCard) {
        if((firstCard.getValue() == secondCard.getValue()) && (firstCard.getValue() == 11)) {//this if statement stops the dealer from busting by drawing two aces
            this.playerScore = 12;
        }
        else{
            this.dealerScore = firstCard.getValue() + secondCard.getValue();
        }
    }

    public void updateDealerScore(Card drawnCard){
        if((drawnCard.getValue() == 11) && dealerScore < 10){//this if statement lets an ace be 1 if the dealer would bust with 11
            this.dealerScore ++;
        }
        else{
            this.dealerScore += drawnCard.getValue();
        }
    }

    public boolean checkPlayerBusted(){
        if(playerScore > 21){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean dealerWillHit(){//returns true if the dealer hits
        if(this.dealerScore >= 17){
            dealerCheck();
            return false;
        }
        else{
            return true;
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
        else if((this.playerScore > this.dealerScore) && isGameOver()){
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

    public int getPlayerScore(){
        return this.playerScore;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public int getDealerScore(){
        return this.dealerScore;
    }
}
