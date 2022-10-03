package src;
/*
 * Jason Boyett - jaboye2448
 * CIT 4423 01
 * October 2, 2022
 * mac OS
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.swing.ImageIcon;

import org.junit.Test;

public class TestGame {//note that the player's score is calculated based on the total value of the cards in the player's hand not on the types of cards so the fact that all the cards in the test hands are aces should not affect anything.
    @Test
    public void gameTestOne(){
        Game testGame = new Game("test");

        testGame.getPlayerHand().remove(4);
        testGame.getPlayerHand().remove(3);
        testGame.getPlayerHand().remove(2);
        testGame.getPlayerHand().remove(1);
        testGame.getPlayerHand().remove(0);
        testGame.getPlayerHand().add(0, new Card("Clubs", 11,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(1, new Card("Clubs", 10,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(2, new Card("Clubs", 0,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(3, new Card("Clubs", 0,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(4, new Card("Clubs", 0,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.updatePlayerScore();
        assertEquals(21, testGame.getPlayerScore(),0);
        assertTrue(testGame.playerWon());
        assertTrue(testGame.isGameOver());
    }

    @Test
    public void gameTestTwo(){
        Game testGame = new Game("test");

        testGame.getPlayerHand().remove(4);
        testGame.getPlayerHand().remove(3);
        testGame.getPlayerHand().remove(2);
        testGame.getPlayerHand().remove(1);
        testGame.getPlayerHand().remove(0);
        testGame.getPlayerHand().add(0, new Card("Clubs", 11,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(1, new Card("Clubs", 10,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(2, new Card("Clubs", 1,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(3, new Card("Clubs", 0,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(4, new Card("Clubs", 0,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.updatePlayerScore();
        assertEquals(22, testGame.getPlayerScore(),0);
        assertFalse(testGame.playerWon());
        assertTrue(testGame.isGameOver());
    }

    @Test
    public void gameTestThree(){
        Game testGame = new Game("test");

        assertFalse(testGame.playerWon());
        assertFalse(testGame.isGameOver());
    }

    @Test
    public void gameTestFour(){
        Game testGame = new Game("test");

        testGame.getPlayerHand().remove(4);
        testGame.getPlayerHand().remove(3);
        testGame.getPlayerHand().remove(2);
        testGame.getPlayerHand().remove(1);
        testGame.getPlayerHand().remove(0);
        testGame.getPlayerHand().add(0, new Card("Clubs", 11,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(1, new Card("Clubs", 11,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(2, new Card("Clubs", 0,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(3, new Card("Clubs", 0,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.getPlayerHand().add(4, new Card("Clubs", 0,"Ace", new ImageIcon("assets/aceOfClubs.png"), new ImageIcon("assets/cardBack.png")));
        testGame.updatePlayerScore();
        assertEquals(12, testGame.getPlayerScore(),0);
        assertFalse(testGame.playerWon());
        assertFalse(testGame.isGameOver());
    }



    
}
