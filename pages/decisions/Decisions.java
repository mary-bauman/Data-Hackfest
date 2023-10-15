package pages.decisions;
import src.Main;

import javax.swing.*;

import buttons.MadLibButton;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import src.Vars;



public class Decisions extends JFrame {
        // Declare Swing components
        public static JLabel myLabel;
        private static JTextField myTextField;
        private Box box;
        public static JButton choice1;
        public static JButton choice2;
        public static char choice;

        Vars v = Vars.getVarsInstance();

        



    public Decisions(){
        // Set the title for the JFrame
        super("Decision Time");

        // Initialize Swing components
        myLabel = new JLabel();
        myTextField = new JTextField(20);
        myTextField.setVisible(false);
        choice = 'A';
        box = Box.createVerticalBox();
        choice1 = new JButton();
        choice2 = new JButton();
        
        box.add(choice1);
        box.add(Box.createVerticalStrut(10));
        box.add(choice2);

        // Set the layout manager for the JFrame (e.g., BorderLayout)
        setLayout(new BorderLayout());

        // Add components to the JFrame
        //add(myButton, BorderLayout.NORTH);
        add(myLabel, BorderLayout.CENTER);
        add(myTextField, BorderLayout.SOUTH);
        add(box, BorderLayout.EAST);

        // Set default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Make the JFrame visible
        setVisible(true);
    }

    public void generateDecision(String question, String[] choices) {
        String madPath = "pages/madlibs/";
        //madPath += v.filePaths[count];


        //decisions stuff
        myLabel.setText(question);
        choice1.setText(choices[0]);
        choice2.setText(choices[1]);
        for (ActionListener listener : choice1.getActionListeners()) {
            choice1.removeActionListener(listener);
        }
        for (ActionListener listener : choice2.getActionListeners()) {
            choice2.removeActionListener(listener);
        }
        choice1.addActionListener(e->{
            choice = 'A';
            Main.m.d.setVisible(false);
            Main.m.decisionTime.setVisible(false);
            Main.m.buttonA.setVisible(true);
            Main.m.a.pressButton(v.getCount());
            v.setCount(v.getCount()+1);
            Main.m.setVisible(true);
            MadLibButton.p1 += choice;
            });
        choice2.addActionListener(e->{
            choice = 'B';
            Main.m.d.setVisible(false);
            Main.m.decisionTime.setVisible(false);
            Main.m.buttonA.setVisible(true);
            Main.m.a.pressButton(v.getCount());
            Main.m.setVisible(true);
            MadLibButton.p1 += choice;
            });
    }

}
