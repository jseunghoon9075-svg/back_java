package anonymousTask;

public class CalcResult {
	private int add;
	private int sum;
	private int devide;
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	private int calc;
	private int num1;
	private int num2;

	public CalcResult() {
		;
	}

	public CalcResult(int add, int sum, int devide, int calc) {
		this.add = add;
		this.sum = sum;
		this.devide = devide;
		this.calc = calc;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getDevide() {
		return devide;
	}

	public void setDevide(int devide) {
		this.devide = devide;
	}

	public int getCalc() {
		return calc;
	}

	public void setCalc(int calc) {
		this.calc = calc;
	}

}
