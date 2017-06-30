package ch10.exam03;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {

		try {
			String str = "ab";
			System.out.println(str.length());

			int[] scores = { 90, 85 };
			for (int i = 0; i < 2; i++) {
				System.out.println(scores[i]);
			}

			String strNum = "a";
			int num = Integer.parseInt(strNum);
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {

			System.out.println("예외 처리 코드1");

		} catch (NumberFormatException e) {

			System.out.println("예외 처리 코드2");

		}

	}
}
