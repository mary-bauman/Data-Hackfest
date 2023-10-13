package buttons;

import javax.swing.*;

import pages.madLib1;


public class ButtonA {
    public JButton myButton;
    public ButtonA() {
    }

    private int count = 0;

    public JButton generateButtonA(JTextField tf, JLabel label){
        myButton = new JButton("Decisions");
        myButton.addActionListener(e -> {
            switch(count) {
                case 0:
                    madLib1.color = tf.getText();
                    tf.setText("");
                    madLib1.myLabel.setText("Enter a name:");
                    break;
                case 1:
                    madLib1.name = tf.getText();
                    tf.setText("");
                    madLib1.myLabel.setText("Enter a food:");
                    break;
                default:
                   madLib1.food = tf.getText();
                    tf.setText("");
                    madLib1.myLabel.setText("You are a " + madLib1.color + " duckling named " + madLib1.name + " who wants " + madLib1.food +".");
            }
            count++;
        });
        
        return myButton;
        
    }
    
}