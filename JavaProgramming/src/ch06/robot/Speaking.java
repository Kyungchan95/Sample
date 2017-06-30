package ch06.robot;

public class Speaking {

	String order;
	String workOrder;

	void speak(String order) {
		workOrder = order;
		switch (order) {
		case "인사":
			System.out.println("안녕하세요 반갑습니다.");
			break;
		case "음악":
			System.out.println("음악을 재생합니다.");
			break;
		case "일과":
			System.out.println("오늘할 일은 청소입니다.");
			break;
		case "중지":
			System.out.println("재생을 중지합니다.");
			break;
		default:
			break;

		}

	}

}
