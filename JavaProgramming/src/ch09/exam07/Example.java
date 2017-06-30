package ch09.exam07;

public class Example {
	public static void main(String[] args) {
		// 로컬 클래스를 정의하고 객체 생성
		class B2 extends A.B {
			@Override
			void bMethod() {
				System.out.println("B2-bMethod()");
			}
		}
		A.B b = new B2();
		b.bMethod();

		// // B를 상속한 객체를 만들어서 대입
		// A.B b = new A.B() {
		// @Override
		// void bMethod() {
		// System.out.println("B2-bMethod()d");
		// }
		// };
		// b.bMethod();

	}
}
