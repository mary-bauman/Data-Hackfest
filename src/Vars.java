package src;
import javax.swing.*;

import buttons.MadLibButton;
import pages.madlibs.MadLib;

import java.awt.*;

public class Vars extends JFrame {
    public String color = "yellow";

    
    private static Vars single_instance = null; 

    private Vars(){
        color = "pink";
    }

    //makes vars singleton so we only have one instance we're interacting with
    public static Vars getVars(){
        if(single_instance==null){
            single_instance = new Vars();
        }
        return single_instance; 
    }

}