package _01_houses;
import org.jointheleague.graphical.robot.Robot;
import java.util.Random;

public class houses {

	public static void main(String[] args) {
		
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.setPenWidth(7);

//		int small = 60;
//		int medium = 120;
//		int large = 250;
		
		rob.setX(25);
		rob.setY(400);
		
		Random randomGen = new Random();
		
		for(int i = 0; i < 9; i++) {
			int Choice = randomGen(6);
			if(Choice == 1) {
				
			} else if(Choice == 2) {
				flatHouseH60();
			} else if(Choice == 3) {
				
			} else if(Choice == 4) {
				
			} else if(Choice == 5) {
				
			} else if(Choice == 6) {
				
			}
		}
		
		
		
		
	}
		
private static int randomGen(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

//		rob.setRandomPenColor();
//		rob.penDown();
//		rob.move(100);
//		rob.turn(90);
//		rob.move(50);
//		rob.turn(90);
//		rob.move(100);
//		rob.setPenColor(0, 255, 0);
//		rob.turn(-90);
//		rob.move(25);
//		rob.turn(-90);
//		
//	}

	
	static void flatHouseH60() {
	
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.setPenWidth(7);
		rob.setRandomPenColor();
		rob.penDown();
		rob.move(60);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(60);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		
	}
	
	static void flatHouseH120() {
		
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.setPenWidth(7);
		rob.setRandomPenColor();
		rob.penDown();
		rob.move(120);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(120);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		
	}
	
	static void flatHouseH250() {
		
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.setPenWidth(7);
		rob.setRandomPenColor();
		rob.penDown();
		rob.move(250);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(250);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		
	}
	
	static void pointyHouseH60() {
		
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.setPenWidth(7);
		rob.setRandomPenColor();
		rob.penDown();
		rob.move(60);
		rob.turn(45);
		rob.move(35);
		rob.turn(90);
		rob.move(35);
		rob.turn(45);
		rob.move(60);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		
	}
	
	static void pointyHouseH120() {
		
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.setPenWidth(7);
		rob.setRandomPenColor();
		rob.penDown();
		rob.move(120);
		rob.turn(45);
		rob.move(35);
		rob.turn(90);
		rob.move(35);
		rob.turn(45);
		rob.move(120);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		
	}
	
	static void pointyHouseH250() {
		
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.setPenWidth(7);
		rob.setRandomPenColor();
		rob.penDown();
		rob.move(250);
		rob.turn(45);
		rob.move(35);
		rob.turn(90);
		rob.move(35);
		rob.turn(45);
		rob.move(250);
		rob.setPenColor(0, 255, 0);
		rob.turn(-90);
		rob.move(25);
		rob.turn(-90);
		
	}
	
}
