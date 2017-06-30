package ch06.exam01;

public class Car {
	// Field
	String company = "현대자동차";
	int speed;
	String color;
	boolean airback;

	// Constructor
	Car() {
		color = "흰색";
		airback = false;
		
	}

	// Method
	void run() {
		System.out.println("현재 " + speed + "km/h 로 달립니다.");
	}

}
