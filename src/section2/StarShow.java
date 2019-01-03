package section2;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in
 * this recipe. 2. ask students how they might use the method to make the
 * picture in the laminated hand-outs.
 */

public class StarShow {

	Robot robot = new Robot("batman");

	void makeStars() {

		// 5. delete this line. You will draw the star again in step 8.
		// 13. Set the speed to 8
		robot.setSpeed(80);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
		int xpos = 10;
		// 7. Make a variable to hold the Y position of the Robot and set it to 600
		int ypos = 600;
		// 8. Make a variable to hold the star size and set it to 25
		int starz = 25;
		// 12. Use a for loop to repeat steps #19 to #18, 30 times
		for (int i = 0; i < 30; i++) {

			// 19. Set the pen width to i
			robot.setPenWidth(i);
			// 10. Set the X position of the robot to your X variable
			robot.setX(xpos);
			// 11. Set the Y position of the robot to your Y variable
			robot.setY(ypos);
			// 9. Call the drawStar() method with your star size variable
			drawStar(starz);
			// 14. Increase the value of the X position variable by star size. See Figure 2
			xpos = xpos + starz;
			// 15. decrease the value of the Y position variable by star size. See Figure 3
			ypos = ypos - starz;
			// 16. Increase the star size by 20
			starz = starz + 20;
			// 17. Turn the robot 12 degrees
			robot.turn(12);
			// 18. Make each star a different random color like in Figure 4
			robot.setRandomPenColor();
		}
	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
		robot.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		for (int i = 0; i < 5; i++) {

			// 1. Move the robot the distance of the starSize variable
			robot.move(starSize);
			// 3. Turn the robot 144 degrees
			robot.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
