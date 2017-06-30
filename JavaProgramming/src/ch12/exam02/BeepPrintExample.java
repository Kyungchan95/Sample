package ch12.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		// BeepThread beepThread = new BeepThread();
		// beepThread.start();

		// 스레드를 상속받아 자식객체를 만든 것
		Thread thread = new Thread() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					}
				}
			}

		};
//		System.out.println(Thread.currentThread().getName());
		thread.start();

		// 프린트를 하는 코드
		for (

				int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}

		}
	}
}
