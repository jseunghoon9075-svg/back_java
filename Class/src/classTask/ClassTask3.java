package classTask;


//1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
//2. 클래스로 리턴
//3. 메인 메서드에서 메서드 사용

class Sum {
	Sum sum;
	
	public Sum() {;}

	Sum isMaxMin(Num1 num1, Num2 num2) {
		double min = 0.0, max = 0.0;
		if(num1.number == num2.number) {
			System.out.println("두 수가 같습니다.");
		}
		if(num1.number > num2.number) {
			max = num1.number;
			min = num2.number;
			System.out.printf("Max:%.2f\nMin:%.2f", max, min);
		} else if(num1.number < num2.number) {
			max = num2.number;
			min = num1.number;
			System.out.printf("Max:%.2f\nMin:%.2f", max, min);
		}
		return sum;
	}
}

class Num1 {
	double number;
	
	public Num1() {;}

	public Num1(double number) {
		this.number = number;
	}
}
class Num2 {
	double number;
	
	public Num2() {;}
	
	public Num2(double number) {
		this.number = number;
	}
}

public class ClassTask3 {
	public static void main(String[] args) {
		Sum result = new Sum();
		Num1 num1 = new Num1(20);
		Num2 num2 = new Num2(200);
		
		result.isMaxMin(num1, num2);
	}
}
