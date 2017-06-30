package ch07.exam08;

public abstract class Tire {
	// Field
	int diameter;

	// Constructor
	Tire() {
		System.out.println("Tire 생성");

	}

	// Method
	abstract void roll();

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

}
