package controlStatement;

import java.util.Scanner;

public class ForTask4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg = "문자와 반복할 횟수를 입력하면 전체 문자열을 만들어주는 프로그램\n예)a2b2\n출력)aabb", str1 = "";
		int num = 97;
		System.out.println(msg);
		str1 = sc.next();
//		문자와 숫자를 받고 문자를 숫자만큼 반복시켜서 변수에 할당
//		받은 문자의 길이만큼 반복을 돌고, 
//		그 안에서 받은 숫자만큼 앞의 문자를 출력
		for(int i = 0; i < str1.length(); i++) { 
			
			System.out.print((int)str1.charAt(i));
		}
	}
}
