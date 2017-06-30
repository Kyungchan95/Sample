package ch11.exam14;

import java.util.Random;

public class WrapperEqualsExample {
	public static void main(String[] args) {

		int maxNum = 6;
		Integer v1 = 1000;
		Integer v2 = 1000;

		// System.out.println(v1 == v2);
		// System.out.println(v1.intValue() == v2.intValue());
		// System.out.println(v1.equals(v2));

		// how1
		int random = (int) (Math.random() * 6) + 1;
		System.out.println(random);

		// how2
		Random obj = new Random();
		int num = obj.nextInt(maxNum) + 1;
		System.out.println(num);

	}
}
