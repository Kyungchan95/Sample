package ch06.homework02;

import java.util.Scanner;

public class BankApplication {
	private static Bank[] bankArray = new Bank[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 > ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("---------------프로그램 종료----------------");
	}

	// 계좌생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌 생성");
		System.out.println("------");

		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		System.out.print("계좌주 : ");
		String owner = scanner.nextLine();
		System.out.print("초기입금액 : ");
		int balance = Integer.parseInt(scanner.nextLine());
		System.out.println("결과 : 계좌가 생성되었습니다.");
		for (int i = 0; i < bankArray.length; i++) {
			if (bankArray[i] == null) {
				bankArray[i] = new Bank(ano, owner, balance);
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌 목록");
		System.out.println("------");
		for (int i = 0; i < bankArray.length; i++) {
			if (bankArray[i] != null) {
				System.out.println(
						bankArray[i].getAno() + "   " + bankArray[i].getOwner() + "   " + bankArray[i].getBalance());
			} else {
				break;
			}
		}

	}

	private static void deposit() {
		System.out.println("------");
		System.out.println("  예금  ");
		System.out.println("------");

		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		Bank bank = findAccount(ano);
		if (bank == null) {
			System.out.println("현재 등록된 계좌가 없습니다.");
		} else {
			System.out.print("예금액 : ");
			int balance = Integer.parseInt(scanner.nextLine());
			bank.setBalance(bank.getBalance() + balance);
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
	}

	private static void withdraw() {
		System.out.println("------");
		System.out.println("  출금  ");
		System.out.println("------");

		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		Bank bank = findAccount(ano);
		if (bank == null) {
			System.out.println("현재 등록된 계좌가 없습니다.");
		} else {
			System.out.print("출금액 : ");
			int balance = Integer.parseInt(scanner.nextLine());
			bank.setBalance(bank.getBalance() - balance);
			System.out.println("결과 : 출금이 성공되었습니다.");
		}

	}

	private static Bank findAccount(String ano) {
		for (int i = 0; i < bankArray.length; i++) {
			if (bankArray[i] == null) {
				break;
			} else if (ano.equals(bankArray[i].getAno())) {
				return bankArray[i];
			}
		}
		return null;
	}

}
