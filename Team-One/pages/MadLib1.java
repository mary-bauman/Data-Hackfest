package pages;

import buttons.ButtonA;

import javax.swing.*;
import java.awt.*;

public class MadLib1 extends JFrame {
        // Declare Swing components
        public JButton myButton;
        public static JLabel myLabel;
        private JTextField myTextField;
    
        //all our little mad lib vars
        public static String color = "Pink";
        public static String name = "Duck";
        public static String food = "Bread";

    public MadLib1(){
        // Set the title for the JFrame
        super("Main");

        // Initialize Swing components
        myLabel = new JLabel("Enter a color:");
        myTextField = new JTextField(20);
        ButtonA a = new ButtonA();
        //ButtonB b = new ButtonB();
        JButton buttonA = a.generateButtonA(myTextField,myLabel);

        // Set the layout manager for the JFrame (e.g., BorderLayout)
        setLayout(new BorderLayout());

        // Add components to the JFrame
        //add(myButton, BorderLayout.NORTH);
        add(myLabel, BorderLayout.CENTER);
        add(myTextField, BorderLayout.SOUTH);
        add(buttonA, BorderLayout.EAST);

        // Set default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Make the JFrame visible
        setVisible(true);
    }
}
