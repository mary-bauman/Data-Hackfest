package buttons;

import javax.swing.*;

import pages.decisions.Decisions;
import pages.madlibs.MadLib;


public class MadLibButton {
    public JButton myButton;
    public MadLibButton() {
    }

    private int count = 0;

    public JButton generateMadLibsButton(JTextField tf, JLabel label){
        myButton = new JButton("Start");
        myButton.addActionListener(e -> {
            String[] prompts = {"color", "name", "food"};
            String p = "pages/madlibs/MadLib1.txt";
            MadLib m = new MadLib();
            m.generateMadLib(p, prompts, false);
            if (!myButton.getText().equals("Enter"))
                myButton.setText("Enter");

            JLabel myLabel = new JLabel();
            JTextField myTextField = new JTextField(20);
            myTextField.setVisible(false);

           


        });
        
        return myButton;
        
    }
    
}