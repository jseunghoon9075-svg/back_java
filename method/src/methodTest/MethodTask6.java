
//2. 1번 메서드 사용package methodTest;
public class MethodTask6 {
//1. 문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드
	
//	문자열과 문자를 매개변수로 받는 메서드를 선언한다
void getStringCount(String str, char ch) {
//	입력받은 문자의 갯수를 세어줄 int count 를 초기화해놓고
		int count = 0;
//		반복문 사용해서 문자열의 길이만큼 돌고 만약(삼항, if) 문자열안에 문자와 입력받은 문자가 같으면 count + 1 
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)== ch) {
				count++;
			}
		}
		System.out.printf("%c의 갯수 : %d", ch, count);
//	입력받은 문자열과 문자를 하나씩 비교해서 같은것이 있다면 count +1씩 해준다 

	}
	public static void main(String[] args) {
		MethodTask6 add = new MethodTask6();
		add.getStringCount("apple", 'p');
	}
}
