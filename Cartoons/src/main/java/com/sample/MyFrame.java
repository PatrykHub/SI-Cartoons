package com.sample;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
 public class MyFrame {
	 
	public JFrame frame;
	 
	public static String checkout(String question, String[] items) {
		//String[] options = {"abc", "def", "ghi", "jkl"};
        //Integer[] options = {1, 3, 5, 7, 9, 11};
        //Double[] options = {3.141, 1.618};
        //Character[] options = {'a', 'b', 'c', 'd'};
        int x = JOptionPane.showOptionDialog(null, question,
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
        return items[x];
	}
	public static void wynik(String[] items) {
		JOptionPane.showMessageDialog(null, "Best for you are:\n - " + String.join("\n - ", items));
	}
 }
 