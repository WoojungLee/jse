package oop;

import java.util.Scanner;

public class AccountMain {	
	public static void main(String[] args) {
		//인스턴스(객체) 생성
		AccountBean account = new AccountBean();
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 ?");
		account.setName(scanner.next());		
		System.out.println("비밀번호 ?");
		account.setPassword(scanner.nextInt());		
		System.out.println("잔액");
		account.setMoney(scanner.nextInt());		
		//System.out.println(account.getName());
		
		
		System.out.println(account.toString());
		// [한빛뱅크] 홍길동 :  1234 계좌, 잔고 1000원
		
	}
}
