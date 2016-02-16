package switchcase;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름?");
		String name = null;
		name = scanner.next();
		System.out.println("주민번호?");
		String ssn = null;
		ssn = scanner.next();
		
		 
		char index = ssn.charAt(7);
		System.out.println(index);
		switch (index) {
		case '1':case '3':
			System.out.println("남자");
			break;
		case '2':case '4':
			System.out.println("여자");
			break;
        
		case '5':case '6':
			System.out.println("외국인");
			break;
		default:
			break;
		}
	}
}
