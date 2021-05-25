package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flavor = JOptionPane.showInputDialog("What flavor do you want your popcorn to be?");
		Popcorn popcorn = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		String minutes = JOptionPane.showInputDialog("How many minutes do you want your popcorn to be cooked?");
		int time = Integer.parseInt(minutes);
		microwave.setTime(time);
		microwave.startMicrowave();
	}

}
