package LambdaTask;
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
public class LambdaTask2 {
	
	public static void main(String[] args) {
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
		
		
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
		Reverse reverseString = str -> {
			String result = "";
//			초기화된 문자열을 선언해주고
//			
//						5			  5 < 0		
			for(int i = 0; i < str.length(); i++) {
//				받은                        5    - 0 
				result += str.charAt(str.length()-1 - i);
			}
			return result;
		};
		
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//	public void printString(PrintString string) {
//		System.out.println(string);
//	};
		PrintString printString = (str, ch) -> {
			int count = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == ch) {
					count++;
				}
			}
			return count;
		}; 
//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10() o
		PrintNum printNum = (num1) -> {
			int[] result = new int[num1];
			for(int i = 0; i < result.length; i++) {
				System.out.print(result[i] = i + 1);
			}
		};
		LambdaTask2 lambdaTask2 = new LambdaTask2();
//		printNum.printUpTo10(10);
//		System.out.println(printString.strCount("apple", 'p'));
		
		System.out.println(reverseString.reverseString("application"));
		
	}
}
