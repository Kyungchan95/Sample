package ch06.homework02;

public class Car {
	int speed;

	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}

}
