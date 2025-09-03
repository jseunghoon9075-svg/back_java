package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> mbtiType = new HashSet<String>();

		mbtiType.add("ISTP");
		mbtiType.add("ISTJ");
		mbtiType.add("ESFJ");
		mbtiType.add("INTP");
		mbtiType.add("ISFJ");
		mbtiType.add("ISTP");
		mbtiType.add("ESFP");

//		System.out.println(mbtiType);
//		for(String mbti: mbtiType) {
//			System.out.println(mbti);
//		}
//		데이터를 가져오고 싶을 때 순서를 부여해야 한다.
//		Iterator: 순서가 없을 때 순서를 부여할 수 있는 인터페이스
		Iterator<String> iter = mbtiType.iterator();
		while(iter.hasNext()) {
			String mbti = iter.next();
			if(mbti.equals("ISTP")) {
				System.out.println(mbti);
				break;
				
			}
		}
//		중복된 데이터 삭제하고 싶을 때
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 10, 20, 10));
		datas = new ArrayList<Integer>(new HashSet<Integer>(datas));
		System.out.println(datas);
		
		
		
	}
}
