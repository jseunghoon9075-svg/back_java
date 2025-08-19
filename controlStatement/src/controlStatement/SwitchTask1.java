package controlStatement;

import java.util.Scanner;

public class SwitchTask1 {
	public static void main(String[] args) {
		// 계절을 맞추는 프로그램
//		겨울 12 1 2 //
//		봄 3 4 5
//		여름 6 7 8
//		가을 9 10 11

//		입력) 10
//		출력) 10월은 가을입니다.
		Scanner sc = new Scanner(System.in);
		String msg = "1~12월 중 하나를 입력하세요 계절을 알려드립니다\n예)1\n출력예)겨울입니다",
				winter = "겨울입니다", spring = "봄 입니다",summer = "여름입니다", fool = "가을입니다";
		int result = 0;

		System.out.println(msg);

		result = sc.nextInt();

		switch (result) {
		case 0:
			System.out.println(winter);
			break;
		case 1:
			System.out.println(winter);
			break;
		case 2:
			System.out.println(winter);
			break;
		case 3:
			System.out.println(spring);
			break;
		
			default: System.out.println("숫자를 입력해주세요 예)1 ~ 12");
		}

	}
}
