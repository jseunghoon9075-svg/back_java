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
		for(User user: users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
//		회원 가입
//		이름,주소,핸드폰번호,아이디,비밀번호,비밀번호확인,이메일(선택)
	public void join(User user) {
		User userInDb = checkId(user.getId());
		if(userInDb == null) {
			users.add(user);
		}
	}
//		로그인
	public boolean login(User user) {
//		사용자가 입력한 아이디가 DB에 있는지 검사
		User userInDb = this.checkId(user.getId());
//		있다면 비밀번호가 DB에 저장되있는 데이터와 같은지 검사
//		둘 다 같다면 login
		if(userInDb != null) {
			if(user.getPassword().equals(userInDb.getPassword())) {
				userId = userInDb.getId();			}
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
		for(int i = 0; i < password.length(); i++) {
			encode += (char)(password.charAt(i) * KEY);
		}
		return encode;
	}
	
	public static void main(String[] args) {
		UserField userField = new UserField();
		System.out.println(userField.encoding("tmdgns875421DQWDK"));
		
	}
//		비밀번호 변경(마이페이지)
//		비밀번호 변경(비밀번호 변경 30일)
//		인증번호 전송
//		인증번호 생성
//		인증번호 확인
}
