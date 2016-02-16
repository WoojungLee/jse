package array;

public class SumOneToTen {
	public static void main(String[] args) {
		int[] arr; //배열의 선언
		arr = new int[3];
		//arr = 3
		//int[] a = new int[10];
		int b = 1 , sum = 0;
		/*a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;
		a[6] = 7;
		a[7] = 8;
		a[8] = 9;
		a[9] = 10;*/
		
		int[] a={1,2,3,4,5,6,7,8,9,10};
		
		/*for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		*/
		for (int i : a) { //확장된 for loop 배열 출력시 사용
			sum += i;
			System.out.println(a[i]);
		}
		//System.out.println(a);
		
		
	}
}
