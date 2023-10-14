package pages.madlibs;
import buttons.MadLibButton;
import pages.decisions.Decisions;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;

public class MadLib extends JFrame {
        // Declare Swing components
        private static JLabel myLabel;
        private static JTextField myTextField;
    
        private static int count = 0;
        private static String[] answers;

    public MadLib(){
        // Set the title for the JFrame
        super("Main");

        // Initialize Swing components
        myLabel = new JLabel();
        myTextField = new JTextField(20);
        myTextField.setVisible(false);
        MadLibButton a = new MadLibButton();
        //ButtonB b = new ButtonB();
        JButton buttonA = a.generateMadLibsButton(myTextField,myLabel);
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

    public static void generateMadLib(String path, String[] words, boolean choice) {
        if (count == 0) {
            myLabel.setText("Enter a " + words[count] + ":");
            answers = new String[words.length];
            myTextField.setVisible(true);
        }
        else if (count <= words.length) {
            answers[count-1] = myTextField.getText();
            myTextField.setText("");
            if (count < words.length)
                myLabel.setText("Enter a " + words[count] + ":");
            else {
                File f = new File(path);
                try {
                    MadLib madLibInstance = new MadLib(); // Create an instance of MadLib
                    Scanner s = new Scanner(f);
                    String finalLib = "";
                    for (int i = 0; i < answers.length; i++)
                        finalLib += (s.nextLine() + answers[i]);
                    finalLib += s.nextLine();
                    myLabel.setText(finalLib);
                    myTextField.setVisible(false);
                    

                    
                    JButton decisionTime = new JButton("Continue", null);
                    madLibInstance.add(decisionTime, BorderLayout.SOUTH);
                    
                    decisionTime.addActionListener(e ->{
                            Decisions d = new Decisions();
                            String[] prompts = {"color", "name", "food"};
                            String p = "pages/decisions/Decisions1.txt";
                            Decisions.generateDecisions(p, prompts, false);
                    });


                    s.close();
                } catch (FileNotFoundException e){ System.out.println("File not found"); };
            }
        }
        count++;
    }
}
