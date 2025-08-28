package anonymousTask2;

import java.io.CharArrayReader;

public class AnonymousTask2 {
	public static void main(String[] args) {
		MyInter myInter = new MyInter() {
			
			String str;
			@Override
			public void getString(String content) {
//				ABCD
//				반복돌고 인덱스가 같으면 + 1 
//				toCharArray : 문자열을 문자배열로 만들어줌
				char[] result = content.toCharArray(); 
				for(int i = 0; i < result.length; i++) {
					System.out.println((char)(result[i] > 66 ? result[i] + 1  : result[i]));
				}
			}
		//   2. 문자열을 입력받고 소문자는 대문자로,
		//   대문자는 소문자로 바꿔주는 메서드
			@Override
			public String changeUpperOrLower(String content) {
				char[] result = content.toCharArray();
				for(int i = 0; i < result.length; i++) {
					if(Character.isUpperCase(result[i])) {
						result[i] = Character.toLowerCase(result[i]);
					}else if(Character.isLowerCase(result[i])) {
						result[i] =	Character.toUpperCase(result[i]);
					}
				}
				return new String(result);
			}
			
		};
		myInter.getString("ABCD");
		
		System.out.println(myInter.changeUpperOrLower("Abscdw"));
	}
}
