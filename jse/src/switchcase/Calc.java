package switchcase;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=0;
		int b=0;
		int result = 0;
		
		System.out.println("숫자 입력");
		a = scanner.nextInt();
		System.out.println("연산자 입력");
		String opcode = "";
		opcode = scanner.next();
		System.out.println("숫자 입력");
		b = scanner.nextInt();
		switch (opcode) {
		case "+":result = a+b;break;
		case "-":result = a-b;break;
		case "*":result = a*b;break;
		case "/":result = a/b;break;
		case "%":result = a%b;break;

		default:System.out.println("연산기호를 정확하게 입력해 주세요");break;
		}
		System.out.println(a + opcode + b + "="+ result);		
	}
}
