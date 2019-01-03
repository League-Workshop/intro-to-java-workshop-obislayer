package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		String Name;
		String bestfriend;
		// 1. Using a pop-up, ask the user who they don't like
		Name = JOptionPane.showInputDialog(null, "Who do you dislike?");
		// 2. Change the next line so that the pop-up will tell them they have a crush
		// on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + Name);
		// 3. Ask the user for the name of their best friend
		bestfriend = JOptionPane.showInputDialog(null, "What's the name of your bestfriend?");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, bestfriend + " is sweet as candy");
	}
}
