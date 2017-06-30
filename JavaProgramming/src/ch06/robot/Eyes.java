package ch06.robot;

public class Eyes {

	boolean lightState;
	String stateOnOff;

	void lightOn() {
		lightState = true;
		System.out.println("Light On!");
		stateOnOff = "On";
	}

	void lightOff() {
		lightState = false;
		System.out.println("Light Off...");
		stateOnOff = "Off";

	}

}
