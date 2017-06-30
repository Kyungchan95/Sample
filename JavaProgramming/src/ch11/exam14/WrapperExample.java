package ch11.exam14;

public class WrapperExample {
	public static void main(String[] args) {
		int v1 = 10;

		Integer v2 = 10; // Auto Boxing
		int v3 = v2; // Auto UnBoxing

		method1(3); // Auto Boxing
		int v4 = method2(); // Auto UnBoxing
	}

	public static void method1(Integer obj) {
	}

	public static Integer method2() {
		return 1;
	}

}
