package classPractice;

class Calc{
	
	int plus(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
	void pay(Calc num1, Calc num2) {
		int res = num1 + num2;
		System.out.prinln("계산결과는 " + res + "입니다.");
	}
}

public class Practice2 {
	public static void main(String[] args) {
		Calc c = new Calc();
		int result = c.plus(1,2);
		c.plus(result, result);
		System.out.println("반환받은 결과는 " + result + "입니다.");
	}
}
