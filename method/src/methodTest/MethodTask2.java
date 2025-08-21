package methodTest;

//	1. 이름을 10번 출력해주는 메서드


//	이름을 받아야함 일단
//	메서드선언은 클래스 안에서 메인메서드 밖에서~~
public class MethodTask2 {
	void getNamePrint(String name) {
		for(int i = 0; i < 10; i++) {
			System.out.print(name + " ");
		}
	}
	public static void main(String[] args) {
		MethodTask2 mt = new MethodTask2();
		mt.getNamePrint("길똥");
	}
}
