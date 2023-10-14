package buttons;
import javax.swing.*;

import pages.decisions.Decisions;

public class DecisionsButton {
    public void ButtonB(){
        
    }
        public JButton generateDecisionsButton(JTextField myTextField, JLabel label){
            JButton myButton = new JButton("Enter");
            myButton.addActionListener(e->{
                Decisions.generateDecision("pages/decisions/Decisions1.txt", null, false);
            });

            return myButton;
        }
    
}

