/*
* Jason Boyett - jaboye2448
* CIT 4423 01
* October 2, 2022
* mac OS
*/
package src;
import javax.swing.ImageIcon;

public class Card{
    private String suite;
    private int value;
    private String type;
    ImageIcon cardFace;
    ImageIcon cardBack;

    public Card(String suite, int value, String type, ImageIcon cardFace, ImageIcon cardBack) {
        this.cardFace = cardFace;
        this.suite = suite;
        this.value = value;
        this.type = type;
        this.cardBack = cardBack;
    }

    public String getSuite() {
        return this.suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return String.format("%s of %s", this.type, this.suite);
    }
    
    public ImageIcon getCardBack(){
        return cardBack;
    }

    public ImageIcon getCardFace() {
        return cardFace;
    }
}