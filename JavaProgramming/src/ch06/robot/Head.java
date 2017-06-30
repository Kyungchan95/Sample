package ch06.robot;

public class Head {

	boolean headBreakState;
	String lookPoint;

	Eyes eyes = new Eyes();
	Movement movement = new Movement();
	Speaking speaking = new Speaking();

	void lookFront() {
		movement.moveFront();
		lookPoint = "Front";

	}

	void lookLeft() {
		movement.moveLeft();
		lookPoint = "Left";

	}

	void lookRight() {
		movement.moveRight();
		lookPoint = "Right";

	}

	void lookBack() {
		movement.moveBack();
		lookPoint = "Back";

	}

	void headBreak() {
		headBreakState = true;
	}

	void headBreakFix() {
		headBreakState = false;

	}

}
