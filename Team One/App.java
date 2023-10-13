import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    // Declare Swing components
    public JButton myButton;
    public JLabel myLabel;
    public JTextField myTextField;

    //all our little mad lib vars
    String color = "Pink";
    String name = "duck";
    String food = "Bread";

    public static void main(String[] args) {
        // Create an instance of App
        SwingUtilities.invokeLater(() -> new App());
    }

    public App() {
        // Set the title for the JFrame
        super("My Java Swing Application");


        // Initialize Swing components
        myTextField = new JTextField(20);

        myLabel = new JLabel("You are a " + color + " duckling named " + name + ".");
        myButton = new JButton("Click Me");


        // Set the layout manager for the JFrame (e.g., BorderLayout)
        setLayout(new BorderLayout());

        // Add components to the JFrame
        add(myButton, BorderLayout.NORTH);
        add(myLabel, BorderLayout.CENTER);
        add(myTextField, BorderLayout.SOUTH);

        // Set default close operation and window size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Add event listeners (e.g., for button clicks)
        myButton.addActionListener(e -> {
            String text = myTextField.getText();
            myLabel.setText("Hello, " + text + "!");
        });

        // Make the JFrame visible
        setVisible(true);
    }


}
