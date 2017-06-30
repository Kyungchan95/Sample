package ch06.robot;

public class Body {

	boolean bodyBreakState;
	int batteryState = 50;

	void chargingBattery(int batt) {
		batteryState = batteryState + batt;
		if (batteryState >= 100) {
			batteryState = 100;
			System.out.println("배터리가 100 가득 찼습니다.");
		} else {
			System.out.println("현재 배터리는 " + batteryState + "만큼 있습니다.");

		}

	}

	void bodyBreak() {
		bodyBreakState = true;
	}

}
