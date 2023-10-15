package buttons;

import javax.swing.*;

import pages.decisions.Decisions;
import pages.madlibs.MadLib;
import src.Main;

import src.Vars;

public class MadLibButton {
    public JButton myButton = new JButton("Start");

    private String[] prompts1 = {"color", "name", "food"};
    public static String p1 = "pages/madlibs/MadLib1";
    private String[] prompts1A = {"noun", "adjective"};
    private String[] choices = {"Yes", "No"};

    private int counter = 0; // sorry I can't stop using counters

    Vars v = Vars.getVarsInstance();



    public MadLibButton() {
    }

    public JButton generateMadLibsButton(JTextField tf, JLabel label){
        myButton.addActionListener(e -> {
            
            this.pressButton(v.getCount());
            v.setCount(v.getCount()+1);
           
        });
        
        return myButton;
        
    }

    public void pressButton(int count) {
        //change p1 to path here mary
        if (counter <= prompts1.length) {
                Main.m.generateMadLib(p1 + ".txt", prompts1, "Will you kick the duck?", choices);
                counter++;
            }
        else {
            Main.m.generateMadLib(p1 + ".txt", prompts1A, "Will this work?", choices);
        }
        myButton.setText("Enter");
    }
    
}