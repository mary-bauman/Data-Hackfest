package buttons;

import javax.swing.*;

import pages.decisions.Decisions;
import pages.madlibs.MadLib;
import src.Main;


public class MadLibButton {
    public JButton myButton = new JButton("Start");

    private String[] prompts1 = {"color", "name", "food"};
    private String p1 = "pages/madlibs/MadLib1.txt";
    private String[] prompts2 = {"noun", "adjective"};
    private String p2 = "pages/madlibs/MadLibTest.txt";

    private int counter = 0; // sorry I can't stop using counters

    public MadLibButton() {
    }

    public JButton generateMadLibsButton(JTextField tf, JLabel label){
        myButton.addActionListener(e -> {
            if (counter <= prompts1.length) {
                Main.m.generateMadLib(p1, prompts1, false);
                counter++;
            }
            else
                Main.m.generateMadLib(p2, prompts2, false);
            if (!myButton.getText().equals("Enter"))
                myButton.setText("Enter");
        
            JLabel myLabel = new JLabel();
            JTextField myTextField = new JTextField(20);
            myTextField.setVisible(false);

           


        });
        
        return myButton;
        
    }
    
}