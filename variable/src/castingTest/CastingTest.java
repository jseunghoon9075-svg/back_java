package castingTest;

public class CastingTest {
	public static void main(String[] args) {
//		정수 + 실수 = 실수
//		자동 형변환
		System.out.println(1 + 2.5);
		
//		정수 + 정수 = 정수
		System.out.println(5 + 3);
		
//		정수 / 정수 = 정수
		System.out.println(5 / 2);
		System.out.println(5.0 / 2);
		
//		강제 형변환
		System.out.println(5 / (double)2);
		System.out.println(5 / (double)2);
		
//		8.43 + 2.59를 더한 값이 10이 되도록 출력 
		
		System.out.println(8.43 + (int)2.59);
	}
}
