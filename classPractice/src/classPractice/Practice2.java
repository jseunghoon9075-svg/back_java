package classPractice;

class Calc{
	
	int plus(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
	void pay(Calc plus) {
		int res = this.plus(1, 2);
		System.out.println("계산결과는 " + res + "입니다.");
	}
}

public class Practice2 {
	public static void main(String[] args) {
		Calc c = new Calc();
		int result = c.plus(1,2);
		
		c.plus(result, result);
		c.pay(c);
		System.out.println("반환받은 결과는 " + result + "입니다.");
	}
}
