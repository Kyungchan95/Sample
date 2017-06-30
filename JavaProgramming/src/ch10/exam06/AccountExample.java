package ch10.exam06;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("잔고 : " + account.getBalance());
		account.deposit(100000);
		System.out.println("잔고 : " + account.getBalance());
		try {
			account.withdraw(1000000);
		} catch (BalanceInsufficientException e) {
			e.printStackTrace();
			System.out.println("------------");
			System.out.println(e.toString());
			System.out.println("------------");
			System.out.println(e.getMessage()); // 실제 예외처리를 할때 많이함
			e.printStackTrace();
		}
		System.out.println("잔고 : " + account.getBalance());

	}

}
