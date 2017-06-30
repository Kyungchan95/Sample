package ch05.exam03;

public class ReadKeyCodeExample {
	public static void main(String[] args) throws Exception {
		int keyCode = 0;
		System.out.println("--------------------------");
		System.out.println("1. ���� | 2.�б� | 3. ����");
		System.out.println("--------------------------");

		while (true) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.print("��ȣ���� : ");
			}
			keyCode = System.in.read();
			// System.out.println(keyCode);

			switch (keyCode) {
			case 49:
				System.out.println("������ �����ϼ̽��ϴ�");
				break;

			case 50:
				System.out.println("�б⸦ �����ϼ̽��ϴ�");
				break;

			case 51:
				System.out.println("������ �����ϼ̽��ϴ�");
				//return;
				System.exit(0);

			}

		}

	}
}
