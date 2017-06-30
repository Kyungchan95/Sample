package ch04.homework01;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1~100합 : " + sum);
	}

}
