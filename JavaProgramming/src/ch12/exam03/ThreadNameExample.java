package ch12.exam03;

public class ThreadNameExample {
	public static void main(String[] args) {
		// 현재 코드를 실행하는 스레드가 어떤 쓰레드인지 이름을 출력
		// String threadName = Thread.currentThread().getName();
		Thread mainThread = Thread.currentThread();
		String threadName = mainThread.getName();

		System.out.println(threadName + "이 출력한 내용");

		WorkThread wt1 = new WorkThread("wt1");
		wt1.start();

		WorkThread wt2 = new WorkThread("wt2");
		wt2.start();
	}

}
