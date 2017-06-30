package ch08.exam01;

public class Vehicle {
	// Field
	private Manual manual;

	// Constructor
	Vehicle(Manual manual) {
		this.manual = manual;
	}

	// Method
	public void move() {
		manual.turnOn();
		manual.setSpeed(Manual.MAX_SPEED);
		manual.run();
		manual.turnOff();
	}

}
