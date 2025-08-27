package anonymousTask;

public class MathField {
	public static void main(String[] args) {
		MathTask mathTask = new MathTask() {
			
			@Override
			public void printName(String name) {
				System.out.println(name);
			}
			
			@Override
			public String concat(String str1, String str2) {
				String result = str1 + str2;
				return result;
			}
			
			@Override
			public CalcResult calc(CalcResult calcResult) {
				CalcResult calc = new CalcResult();
				int addResult = 0, devideResult = 0, sumResult = 0, calculation = 0;
				addResult =  calcResult.getNum1() + calcResult.getNum2();
				devideResult = calcResult.getNum1() - calcResult.getNum2();
				sumResult = calcResult.getNum1() * calcResult.getNum2();
				calculation = calcResult.getNum1() / calcResult.getNum2();
				return calcResult;
			}
			
			@Override
			public int add(int num1, int num2) {
				return 0;
			}

			@Override
			public void calc(int num1, int num2) {
				// TODO Auto-generated method stub
			}
		};
	mathTask.printName("길동");
	System.out.println(mathTask.concat("안녕하세요", " 홍길동입니다"));
	CalcResult resultAll = new CalcResult();
	resultAll.setNum1(10);
	resultAll.setNum2(20);
	}
}
