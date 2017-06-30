package ch06.robot;

public class Robot {
	// Field
	Head head = new Head();
	Body body = new Body();
	Arms arms = new Arms();
	Legs legs = new Legs();
	Power power = new Power();

	String name;
	String owner;
	int serialNum;

	Robot(String name, int serialNum) {
		this.name = name;
		this.serialNum = serialNum;
	}

	void powerOn() {
		power.on();

	}

	void powerOff() {
		power.off();

	}

	void setOwner(String owner) {
		this.owner = owner;

	}

	void chargingBattery(int batt) {
		body.chargingBattery(batt);
	}

	void info() {
		System.out.println("저의 이름은 " + name + ", 제품번호는 " + serialNum + ", 소유주는 " + owner + "입니다.");
	}

	void allState() {
		System.out.println("현재 로봇의 상태는 " + power.state + ", " + head.lookPoint + "을(를) 바라보고 있으며, 팔은 " + arms.armsState
				+ " 상태, " + legs.moveState + " 중이며, Light는  " + head.eyes.stateOnOff + "입니다.");
		System.out.println("현재 진행중인 작업 : " + head.speaking.workOrder + " / 현재 배터리 잔량은 " + body.batteryState + "입니다.");

	}

	void allStateCheck() {
		if (head.headBreakState != true && body.bodyBreakState != true && arms.armsBreakState != true
				&& legs.legsBreakState != true) {
			System.out.println("현재 모든 부품 아무 이상 없습니다.");
		} else {
			System.out.println("현재 비 정상적인 부품이 있습니다.");

		}
	}

	void stateCheck(boolean state) {
		if (state == true) {
			System.out.println("현재 이 부품의 상태가 좋지 않습니다.");
		} else {
			System.out.println("아무 문제 없습니다.");
		}

	}

}
