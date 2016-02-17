package bank;

import java.util.Scanner;

public class AccountMain {	
	public static void main(String[] args) {
		//인스턴스(객체) 생성
		AdminService adminService = new AdminServiceImpl();
		AccountService accountService = new AccountServiceImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 비번");
		//System.out.println(accountService.open(scanner.next(), scanner.nextInt()));
		
		System.out.println("맡기실 금액");
		System.out.println(accountService.deposit(scanner.nextInt()));
		
		System.out.println("찾으실 금액");
		System.out.println(accountService.withdraw(scanner.nextInt()));
		
		System.out.println("잔액 조회");
		System.out.println(accountService.search());

		
	}
}
