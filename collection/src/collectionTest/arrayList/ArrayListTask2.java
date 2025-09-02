package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask2 {
	public static void main(String[] args) {
//		a ~ z 까지 문자열로 ArrayList에 추가하기
		ArrayList<String> strList = new ArrayList<String>();
		
//		97
		for(int i = 0; i < 26; i++) {
			int result = 97 + i;
			strList.add(String.valueOf((char)result));
		}
		System.out.println(strList);
	}
}
