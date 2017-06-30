package ch09.exam08;

public class Button {
	// Field
	private OnClickListener onClickListener; // 인터페이스 타입의 필드 선언

	// Constructor

	// Method
	public void setOnClickListener(OnClickListener onClickListener) { // 외부에서
																		// 인터페이스
																		// 사용 가능
																		// 객체가
																		// 들어옴
		this.onClickListener = onClickListener;
	}

	public void touch() {
		if (onClickListener != null) {
			onClickListener.onClick(); // Setter에서 받은 객체에 대한 onClick 메소드 실행
		}
	}

	// Nested Interface
	interface OnClickListener { // 버튼 클래스를 떠나서는 아무의미 없음
		void onClick();

	}

}
