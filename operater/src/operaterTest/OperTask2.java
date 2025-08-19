package operaterTest;

import java.util.Scanner;

public class OperTask2 {
	public static void main(String[] args) {
//      3개의 입력값 중 중간값 찾기
//      17 25 35
//      10 3 8
//      sc.next();
//      sc.nextint();
//      입력예시: 10 3 8
//      출력예시: 중간값: 8
		Scanner sc = new Scanner(System.in);
		String message = "3개의 정수를 입력하세요.\nex)10 30 40", resultMessage = "중간 값: %d";
		int num1 = 0, num2 = 0, num3 = 0, min = 0, max = 0, middle = 0;
		System.out.println(message);

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		max = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;

		min = num1 < num2 ? num1 < num3 ? num1 : num3 : num2 < num3 ? num2 : num3;

		middle = num1 + num2 + num3 - max - min;
		System.out.printf(resultMessage, middle);
	}
}
