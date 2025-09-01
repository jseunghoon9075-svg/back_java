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

		OperCheck operCheck = expression -> {
			String[] input = null;
//			문자열을 입력받고 1~9까지의 문자열을 제외하고 배열로 반환(연산자 분리)
				input = expression.split("[0-9]|[0-9]");
//						
			return input;
		};

		Scanner sc = new Scanner(System.in);
//    입력받은 문자열
		String msg = sc.next();
		String[] numArr = null, result = null;
		int resultArr = 0;
		int num1 = 0, num2 = 0;
//		입력받은 문자열 중 숫자만분리
		numArr = msg.split("\\+|\\-");
//		입력받은 문자열 중 연산자분리 (문자열배열로 반환받음)
		result = operCheck.getOpers(msg);
		
		for(String a: numArr) {
			System.out.println("입력받은 문자열 중 정수:"+a);
		}
		
		num1 = Integer.parseInt(numArr[0]);
		
		for(int i = 0; i < result.length + i; i++) {
			System.out.println("공백배열 제거 시도"+ result[i]);
			if((result[i].equals(null))) {
				result[i].trim();
			}else if(!(result[i].equals(null))) {
//				연산자 전달
				Calc calc = calculater(result[i]);
//				넘버 전달
				System.out.println(calc.calc(num1, Integer.parseInt(numArr[i + 1])));
				System.out.println("작동");
				return;
			}
			
		}
//		for(String p: result) {
//			System.out.println("입력받은 문자열 중 정수:"+p);
//		}
//		for(int i = 0; i < result.length; i++) {
////			만약에 연산자 분리한 배열값이 null이 아니면 리절트에있는 값을 리절트어레이에 넣는다 연산자가 있으면 넣는다이거지
//			if(!(result[i].equals(null))) {
//				resultArr = result[i];
//			}
//			System.out.println("연산자 분리 후 빈배열 제거시도확인: ");
//		}
//		for(int i = 1; i < numArr.length; i++) {
//			System.out.println(calc.calc(num1, Integer.parseInt(numArr[i])));
//		}
//		System.out.println("Calc에 넘긴값: " + calc.calc(-10, 60));
	}
}
