package methodTest;



public class MethodTask1 {
//	1. 1~10까지 출력해주는 메서드 선언
	void printStraightNum() {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}
	}
//	2. 1번 메서드 사용
	public static void main(String[] args) {
		MethodTask1 add = new MethodTask1();
		add.printStraightNum();
	}
}
