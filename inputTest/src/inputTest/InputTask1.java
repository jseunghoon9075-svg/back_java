package inputTest;

//사용자에게 정수를 2개 입력 받고,
//두 수를 더해서 출력하기
//30 
//50
//출력: 80
//단, 메서드는 .next()만 사용
import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputNum = "숫자를 입력하세요", firstNum = null, secondNum = null;
		int firstResult = 0, secondResult = 0;

		System.out.println(inputNum);

		firstNum = sc.next();
		firstResult = Integer.parseInt(firstNum);

		secondNum = sc.next();
		secondResult = Integer.parseInt(secondNum);

		System.out.println(firstResult + secondResult);

	}
}
