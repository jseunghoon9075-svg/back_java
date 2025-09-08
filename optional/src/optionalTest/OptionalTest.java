package optionalTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

	ArrayList<User> users = new ArrayList<User>(Arrays.asList(
			new User("박길동", "pgd", "1234"),
			new User("홍길동", "hgd", "1234"), 
			new User("고길동", "ggd", "1234"), 
			new User("김길동", "kgd", "1234")
			));

	public Optional<User> findById(Long id) {
		User user = null;
		for (User userInDb : users) {
			if (userInDb.getId() == id) {
				user = userInDb;
			}
		}
		return Optional.ofNullable(user);
	}
//	if문에 한 번이라도 들어가지 않았다면 null이 리턴
//	NPE 발생
//	※강조: 반드시 리턴 타입에만 Optional을 사용하고, 단일 객체만 감싼다.
//	나쁜 예시) Optional<List<User>> -- 박
	public static void main(String[] args) {
		OptionalTest optionalTest = new OptionalTest();
		
		Optional<User> foundUser = optionalTest.findById(200L);
//		만약에 값이있으면 값을주고, 그게 아니라면 통째로 throw
//		실무에서 가장 많이 쓰이는 null처리
//		user가 null이 아니면, 통째로가 user
//		null이면 throw
		try {
			User user = foundUser.orElseThrow(() -> {
//			개발자가 재정의한 Exception 클래스를 만들어 throw를 날려준다
				throw new NoSearchUserException("유저를 찾을 수 없습니다.");
			});
		} catch (NoSearchUserException e) {
			System.out.println("유저를 찾을 수 없습니다. optional/OptionalTest");
		}
//						값이 있는지 없는지 true 또는 false로 리턴해줌
		foundUser.map(User::getId).isPresent();
		
//		.ifPresent(): 값이 없을땐 아무것도 하지않음, 값이 있을때에만 그 값을 수행함.
		optionalTest.findById(100L).map(User::getUserEmail).ifPresent((e) -> System.out.println(e));
		
		User user1 = null;
		if(foundUser.isPresent()) {
			user1 = foundUser.get();
		}
		
		
		String userEmail = null;
		optionalTest.findById(100L).map(User::getUserEmail).ifPresentOrElse((email) -> {
			System.out.println(email);
			foundUser.get();
		}, () -> {
			System.out.println("존재하지 않는 유저입니다.");
		});
	}

}
