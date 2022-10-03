/*
* Jason Boyett - jaboye2448
* CIT 4423 01
* October 2, 2022
* mac OS
*/
package src;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Game {
    private Deck gameDeck;
    private int playerScore = 0;
    private int dealerScore = 0;
    private boolean dealerCheck = false;
    private boolean playerCheck = false;
    private String playerName;
    private ArrayList<Card> playerHand = new ArrayList<>(0);
    private ArrayList<Card> dealerHand = new ArrayList<>(0);

    public Game(String playerName) {
        try {
            this.gameDeck = new Deck();
            this.playerName = playerName;
            populateHands();
            playerHand.add(0, this.gameDeck.drawCard());
            dealerHand.add(0, this.gameDeck.drawCard());
            playerHand.add(1, this.gameDeck.drawCard());
            dealerHand.add(1, this.gameDeck.drawCard());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void newHand() {// this polymorphic constructor is called to start a new game with the same deck
        try {
            if (this.gameDeck.getCards().size() < 10) {// in case the deck is no longer big enough to support a full
                                                       // game
                this.gameDeck = new Deck();
            }
            this.playerScore = 0;
            this.dealerScore = 0;
            this.playerCheck = false;
            this.dealerCheck = false;
            checkPlayerBusted();
            checkDealerBusted();
            isGameOver();
            populateHands();
            playerHand.add(0, this.gameDeck.drawCard());
            dealerHand.add(0, this.gameDeck.drawCard());
            playerHand.add(1, this.gameDeck.drawCard());
            dealerHand.add(1, this.gameDeck.drawCard());
            updateDealerScore();
            updatePlayerScore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatePlayerScore() {
        this.playerScore = 0;
        for (int i = 0; i < this.playerHand.size(); i++) {
            if ((this.playerHand.get(i).getValue() == 11) && this.playerScore > 10) {
                this.playerScore++;
            } else {
                this.playerScore += playerHand.get(i).getValue();
            }
        }
    }

    public void updateDealerScore() {
        this.dealerScore = 0;
        for (int i = 0; i < dealerHand.size(); i++) {
            if ((this.dealerHand.get(i).getValue() == 11) && this.dealerScore > 10) {
                this.dealerScore++;
            } else {
                this.dealerScore += dealerHand.get(i).getValue();
            }
        }
    }

    public boolean checkPlayerBusted() {
        if (playerScore > 21) {
            return true;
        } else {
            return false;
        }
    }

    public boolean dealerWillHit() {// returns true if the dealer hits
        if (this.dealerScore >= 17) {
            dealerCheck();
            return false;
        } else {
            return true;
        }
    }

    public boolean checkDealerBusted() {
        if (dealerScore > 21) {
            return true;
        } else {
            return false;
        }
    }

    public Deck getGameDeck() {
        return this.gameDeck;
    }

    public boolean playerWon() {// the player will lose if both the dealer and the house bust so the house has
                                // an edge
        if (this.checkPlayerBusted()) {
            return false;
        } else if (this.playerScore == 21) {
            return true;
        } else if (this.dealerScore == 21) {
            return false;
        } else if ((!this.checkDealerBusted()) && (this.dealerHand.get(4).getValue() != 0)) {
            return false;
        } else if ((!this.checkPlayerBusted()) && (this.playerHand.get(4).getValue() != 0)) {
            return true;
        } else if (this.checkDealerBusted()) {
            return true;
        } else if ((this.playerScore > this.dealerScore) && isGameOver()) {
            return true;
        } else {
            return false;
        }
    }

    public void playerChecks() {
        this.playerCheck = true;
    }

    public void dealerCheck() {
        this.dealerCheck = true;
    }

    public boolean isGameOver() {
        if (playerCheck && dealerCheck) {
            return true;
        } else if ((this.playerScore >= 21) || (this.dealerScore >= 21)) {
            return true;
        } else if (this.playerHand.get(4).getValue() != 0) {
            return true;
        } else if (checkDealerBusted() || checkPlayerBusted()) {
            return true;
        } else {
            return false;
        }
    }

    private void populateHands() {
        this.playerHand = new ArrayList<Card>(0);
        this.dealerHand = new ArrayList<Card>(0);
        this.playerHand.add(0, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.playerHand.add(1, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.playerHand.add(2, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.playerHand.add(3, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.playerHand.add(4, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.dealerHand.add(0, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.dealerHand.add(1, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.dealerHand.add(2, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.dealerHand.add(3, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
        this.dealerHand.add(4, new Card("Joker", 0, "Joker", Deck.scaleImageIcon("assets/joker.png", 1, 1),
                Deck.scaleImageIcon("assets/cardBack.png", 200, 300)));
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public int getDealerScore() {
        return this.dealerScore;
    }

    public ArrayList<Card> getDealerHand() {
        return this.dealerHand;
    }

    public ArrayList<Card> getPlayerHand() {
        return this.playerHand;
    }
}