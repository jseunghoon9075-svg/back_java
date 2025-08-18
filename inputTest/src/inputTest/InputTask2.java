package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "세 수의 곱 구하기\n입력예)2 2 2\n출력값)8", str1 = null, str2 = null, str3 = null,
				resultMsg = null;
		int num1 = 0, num2 = 0, num3 = 0, result = 0;
		
		System.out.println(msg);
		
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		num3 = Integer.parseInt(str3);
		
		result = num1 * num2 * num3;
		resultMsg = "첫 번째 정수: %s\n두 번째 정수: %s\n세 번째 정수: %s\n곱셈 총합: %d";
		
		System.out.printf(resultMsg, str1, str2, str3, result);
	}
}
