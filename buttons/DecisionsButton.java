package buttons;
import javax.swing.*;

import pages.decisions.Decisions;
import pages.madlibs.MadLib;
import src.Main;

public class DecisionsButton {
    public void ButtonB(){
        
    }
        public JButton generateDecisionsButton(JTextField myTextField, JLabel label){
            JButton myButton = new JButton("Enter");
            myButton.addActionListener(e->{
                Decisions.generateDecision("pages/decisions/Decisions1.txt", null, false);
                Main.m.d.setVisible(false);
                Main.m.decisionTime.setVisible(false);
                Main.m.buttonA.setVisible(true);
                Main.m.a.pressButton();
                Main.m.setVisible(true);
            });
            

            return myButton;
        }
    
}

