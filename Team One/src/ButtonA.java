package src;

import javax.swing.*;
import java.awt.*;

public class ButtonA {
    public JButton myButton;
    public ButtonA() {
    }

    public JButton generateButtonA(JTextField tf, JLabel label){
        myButton = new JButton("Decisions");
        myButton.addActionListener(e -> {
            String text = tf.getText();
            label.setText("there's text here, " + text + "!");
        });
        
        return myButton;
        
    }
    
}