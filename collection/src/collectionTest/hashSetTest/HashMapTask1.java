package collectionTest.hashSetTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

//	HashMap 자료구조 -> key : value;
//	// HashMap 자료구조
	//"street": "Victor Plains",
	//"suite": "Suite 879",
	//"city": "Wisokyburgh",
	//"zipcode": "90566-7771",
	//"lat": "-43.9509",
	//"lng": "-34.4618"

//	value들만 arrayList로 변경 후 출력

public class HashMapTask1 {
	public static void main(String[] args) {
//		
		HashMap<String, Object> hash = new HashMap<>();
		
		hash.put("street", "Victor Plains");
		hash.put("suite", "Suite 879");
		hash.put("city", "Wisoky burgh");
		hash.put("zipcode", "90566-7771");
		hash.put("lat", "-43.9509");
		hash.put("lng", "-34.4618");

		hash.values();
//			System.out.println(hashValue);
			
		
		
		
	}
}
