package collectionTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionPractice {
	public static void main(String[] args) {
		
//		중첩 타입 파라미터
//		제네릭 객체를 제네릭 타입 파라미터로 받는 형식도 표현할 수 있다.
//		ArrayList 자체도 하나의 타입으로써 제네릭 타입 파라미터가 될수 있기 때문에 이렇게 중첩 형식으로 사용할 수 있는 것이다.
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		HashMap<String, Object> prd = new HashMap<>();
		
		prd.put("chicken", 2);
		prd.put("pizza", "cheese");
		HashMap<String, Object> prd2 = new HashMap<>();
		
		prd2.put("water", 50);
		prd2.put("coke", "pepsi");
		
		list.add(prd);
		list.add(prd2);
		System.out.println(list);
	}
}
