package ch06.robot;

public class Arms {
	boolean armsBreakState;
	String armsState = "내림";

	Hands hands = new Hands();
	
	void raiseArms() {
		System.out.println("팔을 올립니다.");
		armsState = "올림";
	}
	
	void lowerArms() {
		System.out.println("팔을 내립니다");
		armsState = "내림";
	}
	
	
	

	void armsBreak() {
		armsBreakState = true;
	}

}
