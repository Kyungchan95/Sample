package ch06.robot;

public class Legs {
	boolean legsBreakState;
	String moveState = "정지";

	void walk() {
		System.out.println("걷습니다.");
		moveState = "걷기";
	}

	void run() {
		System.out.println("달립니다.");
		moveState = "달리기";
	}

	void jump() {
		System.out.println("점프합니다.");
		moveState = "점프";
	}

	void stop() {
		System.out.println("멈춥니다");
		moveState = "정지";
	}

	void legsBreak() {
		legsBreakState = true;
	}

}
