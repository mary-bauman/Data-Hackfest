package src;
import javax.swing.*;

import buttons.MadLibButton;
import pages.madlibs.MadLib;

import java.awt.*;

import java.util.*;

public class Vars extends JFrame {
    //len of vars is hardcoded bc its always the same, even if some are unused
    //these are in order of when they were declared
    public String[] variableArray = new String[500];
    
    private static Vars single_instance = null; 
    public int c = 0;

    public static String[] filePaths = {"MadLib1"};

    private Vars(){
        variableArray[0] = "pink";
    }

    //makes vars singleton so we only have one instance we're interacting with
    public static Vars getVarsInstance(){
        if(single_instance==null){
            single_instance = new Vars();
        }
        return single_instance; 
    }

    public String getVar(int i){
        return variableArray[i];
    }

    public void setVar(int i, String s){
        variableArray[i] = s;
    }

    public int getCount(){
        return c;
    }

    public void setCount(int i){
        c = i;
    }

}