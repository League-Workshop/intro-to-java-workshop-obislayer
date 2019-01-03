package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot root = new Robot();

	void go() {
		// 3. delete this line (used only for testing)
		root.penDown();
		// 6. Make the robot go as fast as possible
		root.setSpeed(100);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int trilength = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int i = 0; i < 600; i++) {

			// 9. Change the color of the pen to a random color
			root.setRandomPenColor();
			// 8. Increase the length variable by 10
			trilength = trilength + 10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(trilength);
			// 10. Turn the robot 6 degrees to the right
			root.turn(6);
		}
	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable when
	 * you call move().
	 */
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {

			root.move(length);
			root.turn(120);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
