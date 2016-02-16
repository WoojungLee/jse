package forloop;

import java.util.Scanner;

public class InputSum {
	// 두개의 정수를 입력받아서 그 범위내의 정수의 합 구하기(단, - 는 없음)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0, j=0;
		int sum = 0;
		System.out.println("정수를 입력하세요 :");
		i = scanner.nextInt();
		j = scanner.nextInt();
		int limited = (i>j) ? i : j;
		int start = (i>j) ? j : i;

		for (int a = start ; a <= limited ; a++) {
			sum+=a;
		}
		System.out.println(sum);

	}

}
