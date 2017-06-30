package ch09.exam07;

public class Example2 {
	public static void main(String[] args) {

		class CImpl implements A.C {
			@Override
			public void cMethod() {
				System.out.println("CImpl-cMethod()");
			}
		}
		A.C c = new CImpl();
		c.cMethod();

		// // C 인터페이스를 사용한 객체
		// A.C c = new A.C() {
		// @Override
		// public void cMethod() {
		// System.out.println("CImpl-cMethod()");
		//
		// }
		// };
		// c.cMethod();

	}
}
