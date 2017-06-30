package ch06.homework02;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong", "12345");
		if (result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberservice.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}

}
