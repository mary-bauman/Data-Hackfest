package buttons;

import javax.swing.*;

import pages.MadLib;


public class ButtonA {
    public JButton myButton;
    public ButtonA() {
    }

    private int count = 0;

    public JButton generateButtonA(JTextField tf, JLabel label){
        myButton = new JButton("Start");
        myButton.addActionListener(e -> {
            String[] prompts = {"color", "name", "food"};
            MadLib.generateMadLib("Team One/pages/madLib1.txt", prompts, false);
            if (!myButton.getText().equals("Decisions"))
                myButton.setText("Decisions");
        });
        
        return myButton;
        
    }
    
}