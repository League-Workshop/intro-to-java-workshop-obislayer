package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String question = JOptionPane.showInputDialog("True or False, Dinosaurs were never real.");
		// 3. Use an if statement to check if their answer is correct
		if (question.equals("False")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Better luck next time, that answer is incorrect");
		}
		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score
		JOptionPane.showMessageDialog(null, ("You have " + score + " point/points"));
	}
}