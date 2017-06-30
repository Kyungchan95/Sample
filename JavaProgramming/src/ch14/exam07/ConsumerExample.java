package ch14.exam07;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		// method1(new Consumer<String>() {
		// @Override
		// public void accept(String t) {
		// System.out.println(t);
		// }
		//
		// });

		method1(s -> System.out.println("과목 : " + s));
		method2((s, t) -> System.out.println(s + "-" + t));
		method3((s, s2) -> {
			for (int i = 0; i < 3; i++)
				System.out.println(s);

		});

	}

	public static void method1(Consumer<String> arg) {
		arg.accept("Java");
	}

	public static void method2(BiConsumer<String, String> arg) {
		arg.accept("IoT", "Java");
	}

	public static void method3(ObjIntConsumer<String> arg) {
		arg.accept("홍길동", 3);
	}

}
