package chatting;

import java.util.Scanner;

//	사용자에게 입력을 받았을 때 특수문자 중 !@#를 사용하면 오류를 발생시키는 로직

public class ExceptionTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = null;

		System.out.println("입력하세요");

		msg = sc.nextLine();

		try {
			if (msg.contains("!")) {
				throw new specialWord("다른 특수문자를 사용해주세요.");
			} else if (msg.contains("@")) {
				throw new specialWord("다른 특수문자를 사용해주세요.");
			} else if (msg.contains("#")) {
				throw new specialWord("다른 특수문자를 사용해주세요.");
			}
		} catch (specialWord e) {
			System.out.println(e.getClass().toString()+ "에서 에러발생");
			System.out.println("※특수문자 사용불가");
			System.out.println(e.getMessage());
		}
	}
}
