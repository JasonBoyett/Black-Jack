import java.awt.Font;

import javax.swing.JButton;
import javax.swing.plaf.FontUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HitButton extends JButton{
    Font font = new FontUIResource(Font.SERIF, CENTER, 20);
    public HitButton(){
        this.setText("HIT ME!");
        this.setFont(font);
        this.setSize(100,200);
        this.addActionListener(e -> System.out.println("hit me!"));
    }
    
}
