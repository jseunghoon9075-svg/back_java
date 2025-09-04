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
		for(int i = 0; i < oper.length(); i++) {
			if(oper.contains("+")) {
				return (num1, num2) ->  num1 + num2;
			} else if(oper.contains("-")) {
				return (num1, num2) ->  num1 - num2;
			}
		}
		return (num1, num2) -> num1 | num2;
	}

	public static void main(String[] args) {
		ArrayList<String> strArr = new ArrayList<>();
		ArrayList<String> operated = new ArrayList<>();
		String[] numbers = null;
		int num1 = 0;
		OperCheck operCheck = expression -> {
			char[] oper = null;
			oper = expression.toCharArray();
			for (int i = 0; i < expression.length(); i++) {
				if (oper[i] == '+' || oper[i] == '-') {
					operated.add(String.valueOf(oper[i]));
				}
			}
//			문자열을 입력받고 "+", "-" 연산자를 제외한 모든 문자열을 뺴고 배열로 반환(연산자 분리)
			return operated;
		};
		Scanner sc = new Scanner(System.in);
//    입력받은 문자열
		String msg = sc.next();

//	   연산자 추출
		strArr = operCheck.getOpers(msg);
		System.out.println("추출한 연산자" + strArr);
//		정수 추출
		numbers = (msg.split("\\+|\\-"));
		for (String p : numbers) {
			System.out.println("추출한 정수: " + p);
		}
		num1 = Integer.parseInt(numbers[0]);
		System.out.println(num1);
		for (int i = 0; i < strArr.size(); i++) {
			calculater(strArr.get(i)).calc(num1, Integer.parseInt(numbers[i + 1]));
			if(numbers.length >= 1) {
				calculater(strArr.get(i)).calc(num1, Integer.parseInt(numbers[1 * i]));
				
			}
		}
	}
	
}
