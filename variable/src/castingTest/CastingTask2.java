package castingTest;

public class CastingTask2 {
	public static void main(String[] args) {
//		1 + "8.24" + "7.8" 두 값을 더해서 115로 만들기
		String num1 = String.valueOf(1);
		int num2 = (int)Double.parseDouble("8.24"), num3 = (int)Double.parseDouble("7.8");
		int result = num2 + num3;
		System.out.println(num1 + result);
		
	}
}
