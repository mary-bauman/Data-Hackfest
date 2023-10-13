package buttons;

import javax.swing.*;

import pages.MadLib;
import pages.MadLib1;


public class ButtonA {
    public JButton myButton;
    public ButtonA() {
    }

    private int count = 0;

    public JButton generateButtonA(JTextField tf, JLabel label){
        myButton = new JButton("Decisions");
        myButton.addActionListener(e -> {
            String[] prompts = {"color", "name", "food"};
            MadLib.generateMadLib("../pages/MadLib1.txt", prompts, false);
        });
        
        
        return myButton;
        
    }
    
}