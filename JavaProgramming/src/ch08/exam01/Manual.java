package ch08.exam01;

public interface Manual {
	// Field
	String COMPANY = "삼성전자";
	int MAX_SPEED = 150;
	int MIN_SPEED = 0;

	// Method
	void turnOn();

	void turnOff();

	void setSpeed(int speed);

	int getSpeed();

	void run();

}
