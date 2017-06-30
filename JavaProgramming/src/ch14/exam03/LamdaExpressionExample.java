package ch14.exam03;

public class LamdaExpressionExample {
	public static int a = 5;

	public static void main(String[] args) {
		method1(() -> {
			a = 8;
			System.out.println(a);
		});

		int b = 5;
		method1(() -> {
			// b = 8; // 로컬변수의 값은 익명객체 안에서 변경할 수 없다.
			System.out.println(a);
		});

	}

	public static void method1(FunctionalInterface1 i) {
		i.method();
	}

}
