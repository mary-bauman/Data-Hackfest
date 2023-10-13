import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    // Declare Swing components
    public JButton myButton;
    public JLabel myLabel;
    public JTextField myTextField;

    public static void main(String[] args) {
        // Create an instance of Main
        SwingUtilities.invokeLater(() -> new Main());
    }

    public Main() {
        // Set the title for the JFrame
        super("Main");

        // Initialize Swing components
        myButton = new JButton("Click Me");
        myLabel = new JLabel("Hello, World!");
        myTextField = new JTextField(20);

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
