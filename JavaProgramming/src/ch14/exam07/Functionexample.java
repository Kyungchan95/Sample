package ch14.exam07;

import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

public class Functionexample {
	public static void main(String[] args) {

		method1((t) -> {
			return (int) t;
		});

		method1((t) -> {
			return (int) Math.round(t);
		});

		method2((obj) -> {
			return obj.getMid();
		});
	}

	public static void method1(DoubleToIntFunction arg) {
		int result = arg.applyAsInt(3.54);
		System.out.println(result);
	}

	public static void method2(Function<Member, String> arg) {
		Member member = new Member("white", "홍길동");
		String result = arg.apply(member);
		System.out.println(result);

	}

}
