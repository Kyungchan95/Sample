package ch06.robot;

public class RobotExample {
	public static void main(String[] args) {
		Robot robot = new Robot("BumbleB", 1004);

		robot.power.on();
		robot.info();
		robot.setOwner("JSG");
		robot.head.eyes.lightOn();

		robot.head.lookFront();
		System.out.println(robot.head.lookPoint);
		robot.head.speaking.speak("음악");

		robot.head.headBreakFix();
		robot.allStateCheck();

		robot.chargingBattery(10);
		robot.chargingBattery(10);
		robot.chargingBattery(10);
		System.out.println("");
		robot.arms.raiseArms();
		robot.legs.run();

		robot.allStateCheck();
		robot.stateCheck(robot.body.bodyBreakState);
		
		robot.allState();
		robot.info();

		
	}

}
