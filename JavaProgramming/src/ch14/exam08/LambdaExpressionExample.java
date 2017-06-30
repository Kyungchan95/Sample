package ch14.exam08;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class LambdaExpressionExample {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("감자바", 95, 93));

	public static void main(String[] args) {
		printString((st) -> {
			return st.getName();
		});

		printInt((st) -> {
			return st.getEnglishScore();
		});

		printInt((st) -> {
			return st.getMathScore();
		});

		double englishAvg = avg((st) -> {
			return st.getEnglishScore();
		});
		System.out.println("영어 평균 점수 : " + englishAvg);

		double mathAvg = avg((st) -> {
			return st.getMathScore();
		});
		System.out.println("영어 평균 점수 : " + mathAvg);
	}

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.print(function.apply(student) + " ");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + " ");
		}
		System.out.println();
	}

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}

}
