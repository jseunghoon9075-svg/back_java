package methodTest;

public class MethodTest {
//	3개의 정수를 받아서, 모두 뺀 값을 반환해주는 메서드 선언
	int getNum(int num1, int num2, int num3) {
		return num1 - num2 - num3;
	}
//	2.성과 이르을 붙여서 출력해주는 메서드 선언
	void addNamePrint(String firstName, String lastName) {
		System.out.println(firstName + lastName);
	}
	
	
//	
//	메인메서드는 사용목적
	public static void main(String[] args) {
		MethodTest me = new MethodTest();
		me.addNamePrint("전봇대", "승훈");
	}
}
