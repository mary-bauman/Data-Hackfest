package src;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    // Declare Swing components
    public JButton myButton;
    public JLabel myLabel;
    public JTextField myTextField;

    //all our little mad lib vars
    String color = "Pink";
    String name = "Duck";
    String food = "Bread";

    
    public static void main(String[] args) {
        // Create an instance of Main
        SwingUtilities.invokeLater(() -> new Main());
    }

    public Main() {
        // Set the title for the JFrame
        super("Main");

        // Initialize Swing components
        myLabel = new JLabel("Hello, World!");
        myTextField = new JTextField(20);
        //ButtonA a = new ButtonA();
        ButtonB b = new ButtonB();
        //JButton buttonA = a.generateButtonA(myTextField,myLabel);

        // Set the layout manager for the JFrame (e.g., BorderLayout)
        setLayout(new BorderLayout());

        // Add components to the JFrame
        //add(myButton, BorderLayout.NORTH);
        add(myLabel, BorderLayout.CENTER);
        add(myTextField, BorderLayout.SOUTH);
        //add(buttonA, BorderLayout.EAST);

        // Set default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Make the JFrame visible
        setVisible(true);
    }


}