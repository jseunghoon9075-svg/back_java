package jsonTest;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonArrayListTest {
	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		JSONArray usersJSON = new JSONArray();
		JSONObject userJSON = new JSONObject();
		User user1 = new User(1L, "홍길동", 17, "개발자");
		User user2 = new User(2L, "장길동", 20, "기획자");
		User user3 = new User(3L, "김길동", 34, "디자이너");
		User user4 = new User(4L, "이길동", 31, "개발자");
		User user5 = new User(5L, "고길동", 50, "사장");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		
		for(int i = 0; i < users.size(); i++) {
			System.out.println((users.get(i)));
			usersJSON.put(new JSONObject(users.get(i)));
		}
//		System.out.println(usersJSON);
//		users.forEach((data) -> {
//			
//		});
//		users.stream().map(JSONObject::new).forEach(usersJSON::put);
			
	}
}
