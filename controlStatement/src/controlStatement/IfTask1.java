package controlStatement;

import java.util.Scanner;

public class IfTask1 {
	public static void main(String[] args) {
//		두 수의 크기 비교
//		예) 10 20
//		출력예) 큰 값: 20, 작은 값: 10
		Scanner sc = new Scanner(System.in);
		String msg = "두 수를 입력해주세요\n예)10 20",result = "입력값:%d %d\n큰 값:%d, 작은 값:%d";
		int num1 = 0, num2 = 0;
		System.out.println(msg);

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.printf(result, num1, num2, num1, num2);
		} else {
			System.out.printf(result, num2, num1, num2, num1);
		}
	}
}
