import javax.swing.*;

import buttons.ButtonA;
import pages.MadLib1;
import java.awt.*;

public class Main extends JFrame {
    
    public static void main(String[] args) {
        // Create an instance of Main
        SwingUtilities.invokeLater(() -> new MadLib1());
    }


}
 