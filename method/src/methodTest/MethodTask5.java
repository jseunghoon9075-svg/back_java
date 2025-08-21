package methodTest;



public class MethodTask5 {
//입력 예시) abcdef
//출력 예시) fedcba
//5. 1~4번까지 메서드 사용

//3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
//void getStr(String str) {
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) >= 97 && str.charAt(i) <= 122) {
//				System.out.print((char)(str.charAt(i) - 32) + " ");
//			}
//		}
//	}
//1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
//	1. n은 매개변수로 받는다 
//	2. 반복문을 돌려서 누적합을 시킨다
//	3. 리턴으로 값 반환한다
//	int sumNumber(int num) {
//		int total = 0;
//		for(int i = 0; i < num; i++) {
//			total += i + 1;
//		}
	
//		return total;
//	}
//2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
//	2. 정수형 매개변수를 받고
//	String isOddEvenStr(int num) {
//	반복문으로 확인결과 반환하기
//		if(num % 2 == 0) {
//			return "짝수";
//		}else if(num % 2 != 0) {
//			return "홀수";
//		} else
//			return "문자열";
//	}
	
	
//4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
//	출력만 할 기떄문에 void 메서드 선언하고 문자열 매개변수를 받는다
//	반대로 정렬해서 위치를 바꿔준다.
//	인덱스를 순차적으로 접근해서 비교하고 더 큰 아스키코드를 가진 인덱스의값을 뒤로보낸다 //이건 안됨 
//	아니면 반복을 거꾸로 돌려서 인덱스 끝번호부터 0번까지 누적합시킨다
//	APPLE 5
	void reverseString (String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(str.length()-1 - i);
			result += c;
		}
	}
	public static void main(String[] args) {
		MethodTask5 add = new MethodTask5();
		add.reverseString("apple");
//		add.getStr("dsadwq");
//		System.out.println(add.isOddEvenStr(0));
//		System.out.println(add.sumNumber(5));
	}
}
