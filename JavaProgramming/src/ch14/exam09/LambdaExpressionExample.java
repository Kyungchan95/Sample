package ch14.exam09;

import java.util.function.IntBinaryOperator;

public class LambdaExpressionExample {
	private static int[] scores = { 92, 95, 87 };

	public static void main(String[] args) {

		int max = maxOrMin((a, b) -> {
			return Math.max(a, b);
		});
		System.out.println("최대값 : " + max);

		int min = maxOrMin((a, b) -> {
			return Math.min(a, b);
		});
		System.out.println("최소값 : " + min);

	}

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
}
