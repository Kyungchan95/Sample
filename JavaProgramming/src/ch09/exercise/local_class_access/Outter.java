package ch09.exercise.local_class_access;

public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100; (X)
		// localVariable = 100; (X)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}

	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100; (X)
		// localVariable = 100; (X)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}

	}

}
