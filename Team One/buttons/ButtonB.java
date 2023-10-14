package buttons;
import javax.swing.*;
import pages.Decisions;

public class ButtonB {
    public void ButtonB(){
        
    }
        public JButton generateButtonB(JTextField tf, JLabel label){
            JButton myButton = new JButton("Enter");
            myButton.addActionListener(e->{
                Decisions.generateDecisions("pages/Decisions1.txt", null, false);
            });



            return myButton;
        }
    
}

