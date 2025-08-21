package methodTest;

public class MethodTask3 {
//	1. 1 ~ n번 까지 출력해주는 함수
//	n번까지 정수형 매개변수를 인자로 받고 반복문으로 출력
	void printxNumber(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print(i + 1);
		}
	}
	
	public static void main(String[] args) {
		MethodTask3 add = new MethodTask3();
		add.printxNumber(10);
	}
}
