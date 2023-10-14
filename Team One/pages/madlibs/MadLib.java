package pages.madlibs;
import buttons.MadLibButton;
import pages.decisions.Decisions;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import src.Main;

public class MadLib extends JFrame {
        // Declare Swing components
        private static JLabel myLabel;
        private static JTextField myTextField;
        public JButton buttonA;
        public JButton decisionTime = new JButton("Continue", null);
        public Decisions d;
        public MadLibButton a;
        private String finalLib;
        private static int count = 0;
        private static String[] answers;


    public MadLib(){
        // Set the title for the JFrame
        super("Main");
                        // Initialize Swing components
        myLabel = new JLabel();
        myTextField = new JTextField(20);
        myTextField.setVisible(false);
        a = new MadLibButton();
        buttonA = a.generateMadLibsButton(myTextField,myLabel);
        finalLib = "";
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

    public void generateMadLib(String path, String[] words, boolean choice) {
        if (count == 0) {
            myLabel.setText("Enter a " + words[count] + ":");
            answers = new String[words.length];
            myTextField.setVisible(true);
            count++;
        }
        else if (count <= words.length) {
            answers[count-1] = myTextField.getText();
            myTextField.setText("");
            if (count < words.length) {
                myLabel.setText("Enter a " + words[count] + ":");
                count++;
            }
            else {
                File f = new File(path);
                try {
                    Scanner s = new Scanner(f);
                    //String finalLib = ""; // uncomment for 1 mad lib at a time
                    if (!finalLib.equals(""))
                        finalLib += "\n\n";
                    for (int i = 0; i < answers.length; i++)
                        finalLib += (s.nextLine() + answers[i]);
                    finalLib += s.nextLine();
                    myLabel.setText("<html>" + finalLib.replaceAll("\n", "<br/>") + "</html>");
                    myTextField.setVisible(false);
                    count = 0;
                    if(choice) {
                        buttonA.setVisible(false);
                        decisionTime.setVisible(true);
                        Main.m.add(decisionTime, BorderLayout.SOUTH);
                        decisionTime.addActionListener(e ->{
                            Main.m.setVisible(false);
                            d = new Decisions();
                            String[] prompts = {"color", "name", "food"};
                            String p = "pages/decisions/Decisions1.txt";
                            Decisions.generateDecision(p, prompts, false);
                        });
                    }
                    s.close();
                } catch (FileNotFoundException e){ System.out.println("File not found"); };
            }
        }
    }
}
