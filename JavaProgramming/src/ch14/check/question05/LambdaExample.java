package ch14.check.question05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int x, int y) {
				return Math.max(x, y);
			}
		});
		System.out.println("최대값 " + max);

		// 최소값 얻기
		int min = maxOrMin(new IntBinaryOperator() {
			@Override
			public int applyAsInt(int x, int y) {
				return Math.min(x, y);
			}
		});
		System.out.println("최소 값 : " + min);
	}
}
