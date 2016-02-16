package switchcase;

import java.util.Scanner;

public class Reportcard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력 : 이름, 과목점수  출력 : 이름, 총점, 평균
		System.out.println("당신의 이름은 무엇입니까?");
		String name = scanner.next();
		System.out.println("각 과목별 점수를 입력하세요.");
		int eng = scanner.nextInt();
		int kor = scanner.nextInt();
		int math = scanner.nextInt();
		int sci = scanner.nextInt();
		int sum = eng + kor + math + sci ;
		double avg =  sum/4;
		
		String result = "";
		/*
		if (avg >= 90.0) {
			result = "장학생";
			
		} else if(avg>=60){
			result = "합격"
		}
		else{
			result = "불합격"
		}
		*/
		//System.out.println(name + "의 과목별 총점은 " + sum + "점 이고, 평균은 " + avg + " 점으로 " + result + " 입니다.");
		int key = (int) (avg/10); //지역변수의 초기화
		
		switch (key) {
		case 10: result = "장학생";break;
		case 9: result = "장학생"; break;
		case 8: result = "합격"; break;
		case 7: result = "합격"; break;
		case 6: result = "합격"; break;
		default: result = "불합격"; break;
		}
		System.out.println(name + "의 과목별 총점은 " + sum + "점 이고, 평균은 " + avg + " 점으로 " + result + " 입니다.");
	}

}
