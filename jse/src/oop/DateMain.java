package oop;

import java.util.Scanner;

public class DateMain {
	public static void main(String[] args) {
		DateService service = new DateServiceImpl();
		
		System.out.println("월을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		String result = service.getEndDateOfMonth(month);
		System.out.println(result);
	
	}
}
