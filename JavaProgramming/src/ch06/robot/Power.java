package ch06.robot;

public class Power {
	
	String state;
	
	void on() {
		System.out.println("전원이 켜집니다.");
		state = "켜짐";
		
	}
	
	void off() {
		System.out.println("전원이 꺼집니다.");
		state = "꺼짐";
		
	}
	
	void sleepMode() {
		System.out.println("절전 모드에 들어갑니다.");
		state = "절전 모드";
	}
	
	void wakeUp() {
		System.out.println("정상 작동 합니다.");
		state = "꺼짐";
		
	}

}
