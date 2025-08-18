//		String.valueOf(값);
//		어떤 값을 문자열로 형변환시켜주는 메서드
//	      모두 대문자로 바꿔서 출력
//	      아스키코드
//	      'A', 'J', 'K'
package castingTest;

public class CastingTask3 {
	public static void main(String[] args) {
		
		char a = 'a', j = 'j', k = 'k';
		String result = "'%c', '%c', '%c'";
		int num = 32;
		char askeyNum = (char)((int)a - num), askeyNum2 = (char)((int)j - num), askeyNum3 = (char)((int)k - num);
		
		System.out.printf(result, askeyNum, askeyNum2, askeyNum3);
	}
}
