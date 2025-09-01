package lambdaExpert;

import java.beans.Expression;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//   [심화 실습]
//   여러 개의 정수를 입력받아서 알맞은 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//   
//   입력 예1) 7 + 35 - 9
//   출력 예1) 33
//   
//   입력 예2) -9 + 8 + 10
//   출력 예2) 9

//   * 사용자가 정상적으로만 입력한다는 가정 하에 구현하도록 한다.
//   * 두 정수를 전달받은 후 int로 리턴하는 calc 추상메소드 선언(함수형 인터페이스 제작)

//   * 전체 식을 전달받은 후 String[]로 리턴하는 getOpers 추상메소드 선언(함수형 인터페이스 제작)

//   * 첫 번째 정수가 음수일 경우 오류 해결

public class MyMath {

//   연산자 1개를 전달 받아서 알맞게 연산하도록 메서드를 구현
//  * 두 정수의 덧셈, 뺄셈을 구해주는 함수형 인터페이스를 리턴하는 static 메소드 선언(람다식 리턴)
	public static Calc calculater(String oper) {

		switch (oper) {
		case "+":
			return (num1, num2) -> num1 + num2;
		case "-":
			return (num1, num2) -> num1 - num2;
		default :
				return  (num1, num2) -> num1 | num2;
			}
	}
	public static String nullCheck(String str) {
		return str == null ? str : String.valueOf(str);
	}

	public static void main(String[] args) {
		ArrayList<String> strArr = new ArrayList<>();
		
		OperCheck operCheck = expression -> {
			String[] input = null;
//			문자열을 입력받고 1~9까지의 문자열을 제외하고 배열로 반환(연산자 분리)
				input = expression.split("[0-9]|[0-9]");
			return input;
		};
		Scanner sc = new Scanner(System.in);
//    입력받은 문자열
		String msg = sc.next();
		String[] numArr = null, result = null;
		int num1 = 0;
//		입력받은 문자열 중 숫자만분리
		numArr = msg.split("\\+|\\-");
		int[] num2 = new int[numArr.length - 1];
//		입력받은 문자열 중 연산자분리 (문자열배열로 반환받음)
		result = operCheck.getOpers(msg);
		
		for(String a: numArr) {
			System.out.println("입력받은 문자열 중 정수:"+a);
		}
		System.out.println("길이" + numArr.length);
		
		num1 = Integer.parseInt(numArr[0]);
		for(int i = 0; i < result.length; i++) {
			if(!(result[i].equals(""))) {
				strArr.add(result[i]);
			}
		}
		for(int i = 0; i < numArr.length; i++) {
			if(i == 0) {
				num2[i] = Integer.parseInt(numArr[i + 1]);
			} else
				continue;
			System.out.println("num2[] 값: " + num2[i]);
		}
		for(int i = 0; i <numArr.length -1; i++) {
			System.out.println(calculater(strArr.get(i)));
		}
		System.out.println(strArr);
	}
}
