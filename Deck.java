import java.awt.Image;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;

public class Deck {

    private int pixelWidth;
    private int pixelHeight;
    private ImageIcon back;
    private ArrayList<Card> cards = new ArrayList<Card>();

    Card aceOfSpades;
    Card kingOfSpades;
    Card queenOfSpades;
    Card jackOfSpades;
    Card tenOfSpades;
    Card nineOfSpades;
    Card eightOfSpades;
    Card sevenOfSpades;
    Card sixOfSpades;
    Card fiveOfSpades;
    Card fourOfSpades;
    Card threeOfSpades;
    Card twoOfSpades;
    Card aceOfClubs;
    Card kingOfClubs;
    Card queenOfClubs;
    Card jackOfClubs;
    Card tenOfClubs;
    Card nineOfClubs;
    Card eightOfClubs;
    Card sevenOfClubs;
    Card sixOfClubs;
    Card fiveOfClubs;
    Card fourOfClubs;
    Card threeOfClubs;
    Card twoOfClubs;
    Card aceOfHearts;
    Card kingOfHearts;
    Card queenOfHearts;
    Card jackOfHearts;
    Card tenOfHearts;
    Card nineOfHearts;
    Card eightOfHearts;
    Card sevenOfHearts;
    Card sixOfHearts;
    Card fiveOfHearts;
    Card fourOfHearts;
    Card threeOfHearts;
    Card twoOfHearts;
    Card aceOfDiamonds;
    Card kingOfDiamonds;
    Card queenOfDiamonds;
    Card jackOfDiamonds;
    Card tenOfDiamonds;
    Card nineOfDiamonds;
    Card eightOfDiamonds;
    Card sevenOfDiamonds;
    Card sixOfDiamonds;
    Card fiveOfDiamonds;
    Card fourOfDiamonds;
    Card threeOfDiamonds;
    Card twoOfDiamonds;

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
        }

    public Deck(int pixelHeight, int pixelWidth) throws FileNotFoundException{
        this.pixelHeight = pixelHeight;
        this.pixelWidth = pixelWidth;

        this.aceOfSpades = new Card("Spades", 11, "Ace", scaleImageIcon("assets/aceOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.kingOfSpades = new Card("Spades", 10, "King", scaleImageIcon("assets/kingOfSpades", this.pixelWidth, this.pixelWidth), this.back);
        this.queenOfSpades = new Card("Spades", 10, "Queen", scaleImageIcon("assets/queenOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.jackOfSpades = new Card("Spades", 10, "Jack", scaleImageIcon("assets/jackOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.tenOfSpades = new Card("Spades", 10, "Ten", scaleImageIcon("assets/tenOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.nineOfSpades = new Card("Spades", 9, "Nine", scaleImageIcon("assets/nineOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.eightOfSpades = new Card("Spades", 8, "Eight", scaleImageIcon("assets/eightOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.sevenOfSpades = new Card("Spades", 7, "Seven", scaleImageIcon("assets/sevenOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.sixOfSpades = new Card("Spades", 6, "Six", scaleImageIcon("assets/sixOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.fiveOfSpades = new Card("Spades", 5, "Five", scaleImageIcon("assets/fiveOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.fourOfSpades = new Card("Spades", 4, "Four", scaleImageIcon("assets/fourOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.threeOfSpades = new Card("Spades", 3, "Three", scaleImageIcon("assets/threeOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.twoOfSpades = new Card("Spades", 2, "Two", scaleImageIcon("assets/twoOfSpades.png", this.pixelWidth, this.pixelHeight), this.back);
        this.aceOfClubs = new Card("Clubs", 11, "Ace", scaleImageIcon("assets/aceOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.kingOfClubs = new Card("Clubs", 10, "King", scaleImageIcon("assets/kingOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.queenOfClubs = new Card("Clubs", 10,"Queen", scaleImageIcon("assets/queenOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.jackOfClubs = new Card("Clubs", 10,"Jack", scaleImageIcon("assets/jackOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.tenOfClubs = new Card("Clubs", 10, "Ten", scaleImageIcon("assets/tenOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.nineOfClubs = new Card("Clubs", 9,"Nine", scaleImageIcon("assets/nineOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.eightOfClubs = new Card("Clubs", 8, "Eight", scaleImageIcon("assets/eightOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.sevenOfClubs = new Card("Clubs", 7, "Seven", scaleImageIcon("assets/sevenOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.sixOfClubs = new Card("Clubs", 6, "Six", scaleImageIcon("assets/sixOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.fiveOfClubs = new Card("Clubs", 5, "Five", scaleImageIcon("assets/fiveOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.fourOfClubs = new Card("Clubs", 4, "Four", scaleImageIcon("assets/fourOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.threeOfClubs = new Card("Clubs", 3, "Three", scaleImageIcon("assets/threeOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.twoOfClubs = new Card("Clubs", 2, "Two", scaleImageIcon("assets/twoOfClubs.png", this.pixelWidth, this.pixelHeight), this.back);
        this.aceOfHearts = new Card("Hearts", 11, "Ace", scaleImageIcon("assets/aceOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.kingOfHearts = new Card("Hearts", 10, "King", scaleImageIcon("assets/kingOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.queenOfHearts = new Card("Hearts", 10, "Queen", scaleImageIcon("assets/queenOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.jackOfHearts = new Card("Hearts", 10, "Jack", scaleImageIcon("assets/jackOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.tenOfHearts = new Card("Hearts", 10, "Ten", scaleImageIcon("assets/tenOfHEarts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.nineOfHearts = new Card("Hearts", 9, "Nine", scaleImageIcon("assets/nineOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.eightOfHearts = new Card("Hearts", 8, "Eight", scaleImageIcon("assets/eightOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.sevenOfHearts = new Card("Hearts", 7, "Seven", scaleImageIcon("assets/sevenOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.sixOfHearts = new Card("Hearts", 6, "Six", scaleImageIcon("assets/sixOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.fiveOfHearts = new Card("Hearts", 5, "Five", scaleImageIcon("assets/fiveOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.fourOfHearts = new Card("Hearts", 4, "Four", scaleImageIcon("assets/fourOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.threeOfHearts = new Card("Hearts", 3, "Three", scaleImageIcon("assets/threeOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.twoOfHearts = new Card("Hearts", 2, "Two", scaleImageIcon("assets/twoOfHearts.png", this.pixelWidth, this.pixelHeight), this.back);
        this.aceOfDiamonds = new Card("Diamonds", 11, "Ace", scaleImageIcon("assets/aceOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.kingOfDiamonds = new Card("Diamonds", 10, "King", scaleImageIcon("assets/kingOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.queenOfDiamonds = new Card("Diamonds", 10, "Queen", scaleImageIcon("assets/queenOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.jackOfDiamonds = new Card("Diamonds", 10, "Jack", scaleImageIcon("assets/jackOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.tenOfDiamonds = new Card("Diamonds", 10, "Ten", scaleImageIcon("assets/tenOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.nineOfDiamonds = new Card("Diamonds", 9, "Nine", scaleImageIcon("assets/nineOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.eightOfDiamonds = new Card("Diamonds", 8, "Eight", scaleImageIcon("assets/eightOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.sevenOfDiamonds = new Card("Diamonds", 7, "Seven", scaleImageIcon("assets/sevenOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.sixOfDiamonds = new Card("Diamonds", 6, "Six", scaleImageIcon("assets/sixOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.fiveOfDiamonds = new Card("Diamonds", 5, "Five", scaleImageIcon("assets/fiveOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.fourOfDiamonds = new Card("Diamonds", 4, "Four", scaleImageIcon("assets/fourOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.threeOfDiamonds = new Card("Diamonds", 3, "Three", scaleImageIcon("assets/threeOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.twoOfDiamonds = new Card("Diamonds", 2, "Two", scaleImageIcon("assets/twoOfDiamonds.png", this.pixelWidth, this.pixelHeight), this.back);
        this.populateDeck();
        Collections.shuffle(this.cards);
        this.back = scaleImageIcon("assets/cardBack.png", this.pixelWidth, this.pixelHeight);

    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public ImageIcon getBackImage(){
        return this.back;
    }

    public int getPixelWidth(){
        return this.pixelWidth;
    }

    public int getPixelHeight() {
        return this.pixelHeight;
    }

    public Card drawCard(){
        Card card = cards.get(cards.size() - 1);
        cards.remove(cards.size() - 1);
        return card;
    }

    private static ImageIcon scaleImageIcon(String path, int width, int height) {
        ImageIcon icon = new ImageIcon(path);// imports the image as an image icon
        Image image = icon.getImage();// casts the image as an Image object
        Image scaled = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);// scales the image
        icon.setImage(scaled);// recasts the scaled image as an ImageIcon
        return icon;// returns the scaled ImageIcon
    }
}