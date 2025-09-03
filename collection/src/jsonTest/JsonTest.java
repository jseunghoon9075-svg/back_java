package jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> hash = new HashMap<>();
		
		hash.put("street", "Victor Plains");
		hash.put("suite", "Suite 879");
		hash.put("city", "Wisoky burgh");
		hash.put("zipcode", "90566-7771");
		hash.put("lat", "-43.9509");
		hash.put("lng", "-34.4618");
		
		JSONObject json = new JSONObject(hash);
		System.out.println(json);
	}
}
