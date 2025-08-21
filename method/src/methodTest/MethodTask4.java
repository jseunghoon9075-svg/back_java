package methodTest;

public class MethodTask4 {
//	1. 사용자에게 이름과 반복횟수를 받아서 반복횟수만큼 이름을 출력해주는 메서드
//	이름과 반복횟수를 인자로 받고
//	for문을 돌려서 출력해준다
	void getNameCountToPrint(String name, int num) {
		for(int i = 0; i < num; i++) {
			System.out.print(name + " ");
		}
	}
	
	
	public static void main(String[] args) {
		MethodTask4 add = new MethodTask4();
		add.getNameCountToPrint("홍길동", 5);
	}
}
