import java.awt.Image;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

public class Deck {

    private final int PIXEL_WIDTH = 200;
    private final int PIXEL_HEIGHT = 300;
    private ImageIcon back;
    private ArrayList<Card> cards = new ArrayList<Card>();

    Card aceOfSpades = new Card("Spades", 11, "Ace", scaleImageIcon("assets/aceOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card kingOfSpades = new Card("Spades", 10, "King", scaleImageIcon("assets/kingOfSpades", this.PIXEL_WIDTH, this.PIXEL_WIDTH), this.back);
    Card queenOfSpades = new Card("Spades", 10, "Queen", scaleImageIcon("assets/queenOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card jackOfSpades = new Card("Spades", 10, "Jack", scaleImageIcon("assets/jackOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card tenOfSpades = new Card("Spades", 10, "Ten", scaleImageIcon("assets/tenOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card nineOfSpades = new Card("Spades", 9, "Nine", scaleImageIcon("assets/nineOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card eightOfSpades = new Card("Spades", 8, "Eight", scaleImageIcon("assets/eightOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card sevenOfSpades = new Card("Spades", 7, "Seven", scaleImageIcon("assets/sevenOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card sixOfSpades = new Card("Spades", 6, "Six", scaleImageIcon("assets/sixOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card fiveOfSpades = new Card("Spades", 5, "Five", scaleImageIcon("assets/fiveOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card fourOfSpades = new Card("Spades", 4, "Four", scaleImageIcon("assets/fourOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card threeOfSpades = new Card("Spades", 3, "Three", scaleImageIcon("assets/threeOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card twoOfSpades = new Card("Spades", 2, "Two", scaleImageIcon("assets/twoOfSpades.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card aceOfClubs = new Card("Clubs", 11, "Ace", scaleImageIcon("assets/aceOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card kingOfClubs = new Card("Clubs", 10, "King", scaleImageIcon("assets/kingOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card queenOfClubs = new Card("Clubs", 10,"Queen", scaleImageIcon("assets/queenOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card jackOfClubs = new Card("Clubs", 10,"Jack", scaleImageIcon("assets/jackOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card tenOfClubs = new Card("Clubs", 10, "Ten", scaleImageIcon("assets/tenOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card nineOfClubs = new Card("Clubs", 9,"Nine", scaleImageIcon("assets/nineOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card eightOfClubs = new Card("Clubs", 8, "Eight", scaleImageIcon("assets/eightOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card sevenOfClubs = new Card("Clubs", 7, "Seven", scaleImageIcon("assets/sevenOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card sixOfClubs = new Card("Clubs", 6, "Six", scaleImageIcon("assets/sixOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card fiveOfClubs = new Card("Clubs", 5, "Five", scaleImageIcon("assets/fiveOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card fourOfClubs = new Card("Clubs", 4, "Four", scaleImageIcon("assets/fourOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card threeOfClubs = new Card("Clubs", 3, "Three", scaleImageIcon("assets/threeOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card twoOfClubs = new Card("Clubs", 2, "Two", scaleImageIcon("assets/twoOfClubs.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card aceOfHearts = new Card("Hearts", 11, "Ace", scaleImageIcon("assets/aceOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card kingOfHearts = new Card("Hearts", 10, "King", scaleImageIcon("assets/kingOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card queenOfHearts = new Card("Hearts", 10, "Queen", scaleImageIcon("assets/queenOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card jackOfHearts = new Card("Hearts", 10, "Jack", scaleImageIcon("assets/jackOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card tenOfHearts = new Card("Hearts", 10, "Ten", scaleImageIcon("assets/tenOfHEarts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card nineOfHearts = new Card("Hearts", 9, "Nine", scaleImageIcon("assets/nineOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card eightOfHearts = new Card("Hearts", 8, "Eight", scaleImageIcon("assets/eightOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card sevenOfHearts = new Card("Hearts", 7, "Seven", scaleImageIcon("assets/sevenOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card sixOfHearts = new Card("Hearts", 6, "Six", scaleImageIcon("assets/sixOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card fiveOfHearts = new Card("Hearts", 5, "Five", scaleImageIcon("assets/fiveOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card fourOfHearts = new Card("Hearts", 4, "Four", scaleImageIcon("assets/fourOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card threeOfHearts = new Card("Hearts", 3, "Three", scaleImageIcon("assets/threeOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card twoOfHearts = new Card("Hearts", 2, "Two", scaleImageIcon("assets/twoOfHearts.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card aceOfDiamonds = new Card("Diamonds", 11, "Ace", scaleImageIcon("assets/aceOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card kingOfDiamonds = new Card("Diamonds", 10, "King", scaleImageIcon("assets/kingOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card queenOfDiamonds = new Card("Diamonds", 10, "Queen", scaleImageIcon("assets/queenOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card jackOfDiamonds = new Card("Diamonds", 10, "Jack", scaleImageIcon("assets/jackOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card tenOfDiamonds = new Card("Diamonds", 10, "Ten", scaleImageIcon("assets/tenOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card nineOfDiamonds = new Card("Diamonds", 9, "Nine", scaleImageIcon("assets/nineOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card eightOfDiamonds = new Card("Diamonds", 8, "Eight", scaleImageIcon("assets/eightOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card sevenOfDiamonds = new Card("Diamonds", 7, "Seven", scaleImageIcon("assets/sevenOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card sixOfDiamonds = new Card("Diamonds", 6, "Six", scaleImageIcon("assets/sixOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card fiveOfDiamonds = new Card("Diamonds", 5, "Five", scaleImageIcon("assets/fiveOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card fourOfDiamonds = new Card("Diamonds", 4, "Four", scaleImageIcon("assets/fourOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card threeOfDiamonds = new Card("Diamonds", 3, "Three", scaleImageIcon("assets/threeOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);
    Card twoOfDiamonds = new Card("Diamonds", 2, "Two", scaleImageIcon("assets/twoOfDiamonds.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT), this.back);

    private void populateDeck(){//adds all the cards to the cards array list
        this.cards.add(aceOfDiamonds);
        this.cards.add(kingOfDiamonds);
        this.cards.add(queenOfDiamonds);
        this.cards.add(jackOfDiamonds);
        this.cards.add(tenOfDiamonds);
        this.cards.add(nineOfHearts);
        this.cards.add(eightOfDiamonds);
        this.cards.add(sevenOfDiamonds);
        this.cards.add(sixOfDiamonds);
        this.cards.add(fiveOfDiamonds);
        this.cards.add(fourOfDiamonds);
        this.cards.add(threeOfDiamonds);
        this.cards.add(twoOfDiamonds);
        this.cards.add(aceOfHearts);
        this.cards.add(kingOfHearts);
        this.cards.add(queenOfHearts);
        this.cards.add(jackOfHearts);
        this.cards.add(tenOfHearts);
        this.cards.add(nineOfHearts);
        this.cards.add(eightOfHearts);
        this.cards.add(sevenOfHearts);
        this.cards.add(sixOfHearts);
        this.cards.add(fiveOfHearts);
        this.cards.add(fourOfHearts);
        this.cards.add(threeOfHearts);
        this.cards.add(twoOfHearts);
        this.cards.add(aceOfClubs);
        this.cards.add(kingOfClubs);
        this.cards.add(queenOfClubs);
        this.cards.add(jackOfClubs);
        this.cards.add(tenOfClubs);
        this.cards.add(nineOfClubs);
        this.cards.add(eightOfClubs);
        this.cards.add(sevenOfClubs);
        this.cards.add(sixOfClubs);
        this.cards.add(fiveOfClubs);
        this.cards.add(fourOfClubs);
        this.cards.add(threeOfClubs);
        this.cards.add(twoOfClubs);
        this.cards.add(aceOfSpades);
        this.cards.add(kingOfSpades);
        this.cards.add(queenOfSpades);
        this.cards.add(jackOfSpades);
        this.cards.add(tenOfSpades);
        this.cards.add(nineOfSpades);
        this.cards.add(eightOfSpades);
        this.cards.add(sevenOfSpades);
        this.cards.add(sixOfSpades);
        this.cards.add(fiveOfSpades);
        this.cards.add(fourOfSpades);
        this.cards.add(threeOfSpades);
        this.cards.add(twoOfSpades);
        Collections.shuffle(this.cards);
        }

    public Deck() throws FileNotFoundException{
        this.populateDeck();
        this.back = scaleImageIcon("assets/cardBack.png", this.PIXEL_WIDTH, this.PIXEL_HEIGHT);
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public ImageIcon getBackImage(){
        return this.back;
    }

    public int getPixelWidth(){
        return this.PIXEL_WIDTH;
    }

    public int getPixelHeight() {
        return this.PIXEL_HEIGHT;
    }

    public Card drawCard(){
        Card card = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return card;
    }

    public static ImageIcon scaleImageIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);// imports the image as an image icon
        Image image = icon.getImage();// casts the image as an Image object
        Image scaled = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);// scales the image
        icon.setImage(scaled);// recasts the scaled image as an ImageIcon
        return icon;// returns the scaled ImageIcon
    }
}