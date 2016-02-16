package operation;

import java.util.Scanner;

public class TimeCal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== 초를 시간과 분과 초로 바꾸어 주는 프로그램 ===");
		System.out.println("초를 입력하세요.");
		/**
		 *  + - * / %
		 * sec, min, hour
		 * */
		int sec = scanner.nextInt();
		int min = 0;
		int hour = 0;
		int a = sec%60; //초를 60으로 나눈 나머지
		int b = min%60; //분을 60으로 나눈 나머지
		/**
		 * int min = sec /60;
		 * sec  %=  60;
		 * int hour = min/60;
		 * min %= 60;
		 * */
		if (sec < 60) {
			System.out.println("입력한" + sec + "초는 " + a +"초 입니다.");
		} else {
			if (b<60) {
				System.out.println("입력한" + sec +"초는 " + b + "분" + a + " 초 입니다.");
			} else {
				
				System.out.println("입력한" + sec +"초는 "+  hour + "시간 " + b +"분 " + a + " 초 입니다.");
			}

		}
		
		
	}
}
