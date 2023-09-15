package com.introduction.unit2;

import javax.swing.JOptionPane;

public class Ex2_4 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog( "What is your name");
        String tmp = "";
        
        for (int i = name.length()-1; i >= 0; i--) {
            tmp += name.charAt(i);
            
        }
        JOptionPane.showMessageDialog(null,  tmp);
        System.exit(0);
    }
    
}
