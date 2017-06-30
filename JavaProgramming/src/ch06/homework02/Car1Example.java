package ch06.homework02;

public class Car1Example {
	public static void main(String[] args) {
		Car1 myCar = new Car1();

		myCar.setSpeed(-50);

		System.out.println("����ӵ� : " + myCar.getSpeed());

		myCar.setSpeed(60);

		if (!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("����ӵ� : " + myCar.getSpeed());
	}

}
