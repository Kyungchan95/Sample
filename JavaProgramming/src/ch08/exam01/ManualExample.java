package ch08.exam01;

public class ManualExample {
	public static void main(String[] args) {

		Manual manual = new Car();
		manual.turnOn();
		manual.setSpeed(Manual.MAX_SPEED);
		manual.run();
		manual.turnOff();
	}
}
