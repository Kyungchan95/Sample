package ch09.exam03;

public class A {
	// Field
	int field;

	// Constructor
	// Method
	class B {
		// Field
		int field;

		// Constructor
		// Method
		void method() {
			field = 10;
			this.field = 10;
			A.this.field = 10;
		}

	}

}
