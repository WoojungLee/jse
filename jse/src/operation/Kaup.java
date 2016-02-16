package operation;

import java.util.Scanner;

public class Kaup {
	/**
	 * 키를 입력하세요
	 * height
	 * 몸무게를 입력하세요
	 * weight
	 * 카우푸 인댁스
	 * index = (몸무게 / (키*키)) * 10000
	 * index > 30 비만
	 * 20>=index > 24 과체중 => if()
	 * > 20 정상
	 * > 15 저체중
	 * >13 마름
	 * >10영양실조
	 * 소모증(10미만)
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String result;
		
		System.out.println("이름을 입력하세요:");
		String name = scanner.next();
		
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		
		int index = (int) ((weight/(height*height)) * 10000);
		
		if (index > 30) {
			System.out.println("결과 :" + name + "는 비만입니다");			
		} else if(index > 20 ){
			System.out.println("결과 :" + name + "는 정상입니다");
		} else if(index > 15){
			System.out.println("결과 :" + name + "는 정상입니다");
		} else if(index > 13){
			System.out.println("결과 :" + name + "는 마름입니다");
		} else if(index > 10){
			System.out.println("결과 :" + name + "는 영양실조입니다");
		}
		else{ 		
			System.out.println("결과 :" + name + "는 소모증입니다");
		}
	}

}
