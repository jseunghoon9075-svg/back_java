package collectionTest.hashSetTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "alslrnf");
		userMap.put("password", "1234");
		userMap.put("name", "승훈");
		userMap.put("age", 20);
		userMap.put("isRich", false);

		
		System.out.println(userMap.get("age"));
//		key와 value를 한 쌍으로 묶은 자료구조를 Entity라고한다.
		Iterator<Entry<String,Object>> userMapIter = userMap.entrySet().iterator();
		while(userMapIter.hasNext()) {
			Entry<String, Object> entry = userMapIter.next();
		}
	}
}
