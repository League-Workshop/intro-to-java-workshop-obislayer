package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String yes = JOptionPane.showInputDialog("Do you know how to code?");
		// 2. If they say "yes", tell them they will rule the world
		if (yes.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world, ya big donkey.");
		} else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes you scrub, ba-dum-tts");
		}

	}
}
