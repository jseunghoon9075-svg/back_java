package castingTest;

public class CastingTask1 {
	public static void main(String[] args) {
		double num1 = 8.43;
		double num2 = 2.59;
		
		int result = 0;
		
		System.out.println((int)num1 + (int)num2);
		
//		자동형변환
//		문자형 + 정수 = 정수
		System.out.println('A' + 100);
		System.out.println((int)('A' * 100));
	}
}
