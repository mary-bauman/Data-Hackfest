package pages;
import buttons.ButtonB;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class Decisions extends JFrame {
        // Declare Swing components
        private static JLabel myLabel;
        private static JTextField myTextField;
    
        private static int count = 0;
        private static String[] answers;

    public Decisions(){
        // Set the title for the JFrame
        super("Main");

        // Initialize Swing components
        myLabel = new JLabel();
        myTextField = new JTextField(20);
        myTextField.setVisible(false);
        ButtonB b = new ButtonB();
        JButton buttonB = b.generateButtonB(myTextField,myLabel);

        // Set the layout manager for the JFrame (e.g., BorderLayout)
        setLayout(new BorderLayout());

        // Add components to the JFrame
        //add(myButton, BorderLayout.NORTH);
        add(myLabel, BorderLayout.CENTER);
        add(myTextField, BorderLayout.SOUTH);
        add(buttonB, BorderLayout.EAST);

        // Set default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Make the JFrame visible
        setVisible(true);
    }

    public static void generateDecisions(String path, String[] words, boolean choice) {
        //decisions stuff
        myLabel.setText("You have a decision to make...");
        File f = new File(path);
    }

}
