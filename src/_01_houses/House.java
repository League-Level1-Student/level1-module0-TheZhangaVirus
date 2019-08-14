package _01_houses;

import org.jointheleague.graphical.robot.Robot;
import java.util.Random;

public class House {
	
	static Robot rob = new Robot("mini");

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		rob.setX(112);
		rob.setY(500);
		rob.setSpeed(100);
		rob.penDown();
		rob.setPenWidth(7);
		rob.setWindowColor(0, 0, 0);
		
		for(int i = 0; i < 9; i++) {
			int size = rand.nextInt(5);
			if(size == 0) {
				drawHouse("small");
			} else if(size == 1) {
				drawHouse("medium");
			} else if(size == 2) {
				drawHouse("large");
			} else if(size == 3) {
				drawPointyRoof("small");
			} else if(size == 4) {
				drawPointyRoof("medium");
			}
		
		}
		
	}
	
	static void drawHouse(int houseSize) {

		rob.setRandomPenColor();
		rob.move(houseSize);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(houseSize);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		
	}
	
	static void drawHouse(String houseSize) {
		
		if(houseSize.equals("small")) {
			drawHouse(60);
		} else if(houseSize.equals("medium")) {
			drawHouse(120);
		} else if(houseSize.equals("large")) {
			drawHouse(250);
		}
		
	}
	
	static void drawPointyRoof(int houseSize) {

		rob.setRandomPenColor();
		rob.move(houseSize - 25);
		rob.turn(45);
		rob.move(37);
		rob.turn(90);
		rob.move(37);
		rob.turn(45);
		rob.move(houseSize - 25);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		
	}
	
	static void drawPointyRoof(String houseSize) {
		
		if(houseSize.equals("small")) {
			drawPointyRoof(60);
		} else if(houseSize.equals("medium")) {
			drawPointyRoof(120);
		} else if(houseSize.equals("large")) {
			drawHouse(250);
		}
		
	}

}
