package collectionTest.arrayList2;

import java.util.ArrayList;

public class UserField {
//	DB
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
//	상수는 대문자로 표기한다
	final int KEY = 300;

//		아이디 검사
	public User checkId(String id) {
//		id를 받아서 db에 아이디가 있ㄴ는지 아닌지를 검사한다.
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

//		회원 가입
//		이름,주소,핸드폰번호,아이디,비밀번호,비밀번호확인,이메일(선택)
	public void join(User user) {
		User userInDb = checkId(user.getId());
		if (userInDb == null) {
			users.add(user);
		}
	}

//		로그인
	public boolean login(User user) {
//		사용자가 입력한 아이디가 DB에 있는지 검사
		User userInDb = this.checkId(user.getId());
//		있다면 비밀번호가 DB에 저장되있는 데이터와 같은지 검사
//		둘 다 같다면 login
		if (userInDb != null) {
			if (user.getPassword().equals(userInDb.getPassword())) {
				userId = userInDb.getId();
			}
			return true;
		}
		return false;
	}

//		로그아웃
//		사용자가 로그아웃 버튼을 누르면 로그아웃
	public void logout() {
//		버튼을 누르면 들어와있는 현재데이터가 null로 변경되고 현재 데이터가 없어졌으므로 로그아웃이 됨
		userId = null;
	}

//		암호화
//	회원가입시 실행되는 메서드이므로 비밀번호만 받는다.
	public String encoding(String password) {
		String encode = "";
		for (int i = 0; i < password.length(); i++) {
			encode += (char) (password.charAt(i) * KEY);
		}
		return encode;
	}

//	비밀번호 변경(마이페이지)
	public void changePasswordMyPage(User user, String password) {
		User change = null;
//	유저를 받고 입력한 비밀번호를 인코딩 후 현재 유저의 비밀번호와 같은지 검사
		try {
			if ((encoding(password).equals(user.getPassword()))) {
//			같으면 false -> 같은 비밀번호로 변경 불가
				System.out.println("현재와 같은 비밀번호로 변경 불가 합니다");
			} else
//	다르면 true -> 다르면 입력한 비밀번호를 db에 해당유저의 비밀번호 수정
				change = user;
//			setter이용해 값을 수정하는데 인코딩을 해줘야함
			change.setPassword(encoding(password));
//			DB에 데이터 수정! .set을 이용하고 리스트에 변경된 유저를 준다
			if (users.contains(change)) {
				users.set(users.indexOf(change), change);
			}
		} catch (NullPointerException e) {
			System.out.println("현재와 비밀번호와 다른 비밀번호로 입력하세요.");
		} catch (Exception e) {
			e.getMessage();
		}
	}

//	Product foundProduct = null;
//  for(Product product: products) {
//     if(product.getId() == 3L) {
//        foundProduct = product;
//     }
//  }
//  foundProduct.setPrice(100000);
//  
//  try {
//     if(products.contains(foundProduct)) {
//        products.set(products.indexOf(foundProduct), foundProduct);
//     }

//	비밀번호 변경(비밀번호 변경 30일)
//	조건 1. 로그인이 된 바로 직후
//	로그인 후 db에 저장된 해당 유저의 비밀번호가 30일이 지났다면 "비밀번호가 변경 된 지 30일이 지났습니다!\n변경 하시겠습니까??" 출력
//	이후 비밀번호 변경(마이페이지)의 메서드 사용

//	인증번호 전송
//	인증번호 생성
//	인증번호 확인

	public static void main(String[] args) {
		User user = new User("1", "전승훈", "123456", "01012345678");
		UserField userField = new UserField();
		user.setPassword(userField.encoding(user.getPassword()));
		userField.join(user);
		System.out.println(userField.checkId("1"));
		System.out.println(userField.login(user));
		userField.changePasswordMyPage(user, "123456");

		System.out.println(userField.checkId("1"));
//		리스트 출력하려면 리스트 선언부에 static을 붙혀라 나오는데 왜 안붙힌건지 여쭤보기
//		System.out.println(users);

	}

}
