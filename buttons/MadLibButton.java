package buttons;

import javax.swing.*;

import pages.decisions.Decisions;
import pages.madlibs.MadLib;
import src.Main;

import src.Vars;

public class MadLibButton {
    public JButton myButton = new JButton("Start");

    private String[] prompts1 = {"color", "name", "food", "business name", "adjective", "food" };
    public static String p1 = "pages/madlibs/MadLib1";
    private String[] prompts1A = {"emotion", "action"};
    private String[] prompts1B = {"business name"};
    private String[] prompts1AA = {"adjective", "color"};
    private String[] prompts1AB = {"clothes", "thing"};
    private String[] prompts1BB = {"business name", "price"};
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
                Main.m.generateMadLib(p1 + ".txt", prompts1, "Will you go to the picnic?", choices);
                counter++;
            }
        else {
            if (p1.equals("pages/madlibs/MadLib1A"))
                Main.m.generateMadLib(p1 + ".txt", prompts1A, "Do you try to cuddle with the family?", choices);
             else if (p1.equals("pages/madlibs/MadLib1B"))
                Main.m.generateMadLib(p1 + ".txt", prompts1B, "Do you pick up a knife with your little duck beak?", choices);
            else if (p1.equals("pages/madlibs/MadLib1AA"))
                Main.m.generateMadLib(p1 + ".txt", prompts1AA, "Do you try to take their food from the picnic blanket and run for it?", choices);
            else if (p1.equals("pages/madlibs/MadLib1AB"))
                Main.m.generateMadLib(p1 + ".txt", prompts1AB);
            else if (p1.equals("pages/madlibs/MadLib1BB"))
                Main.m.generateMadLib(p1 + ".txt", prompts1BB);
            

        }
        myButton.setText("Enter");
    }
    
}