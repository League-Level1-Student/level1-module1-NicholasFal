package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
 JFrame frame = new JFrame();
 JPanel panel = new JPanel();
 JTextField input = new JTextField(20);
 JButton convert = new JButton();

 JLabel result = new JLabel();
 void setup() {
	 convert.addActionListener(this);
	 convert.setText("Convert");
	 frame.setVisible(true);
	 frame.add(panel);
	 panel.add(input);
	 panel.add(convert);
	 panel.add(result);
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.pack();
	 
 }
 String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	String letter = convert(input.getText());
	result.setText(letter);
	frame.pack();
}
}
