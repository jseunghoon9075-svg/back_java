package collectionTest.arrayList2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

public class UserField {
//	DB
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
	public static String code;
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

//	수정하는 메서드로 변경 (비밀번호변경)
	public void update(User user) {
//		DB에 해당유저의 id가 있는지 검사
		User userInDb = checkId(user.getId());
		if(userInDb != null) {
			userInDb.setPassword(encoding(user.getPassword()));
		}
	}
	
//	비밀번호 변경(마이페이지)
//	public void changePasswordMyPage(User user, String password) {
////		변경값을 넣어줄 변수 선언
//		User change = null;
//		try {
////			유저를 받고 입력한 비밀번호를 인코딩 후 현재 유저의 비밀번호와 같은지 검사
//			if ((encoding(password).equals(user.getPassword()))) {
////			같으면 false -> 같은 비밀번호로 변경 불가
//				System.out.println("현재와 같은 비밀번호로 변경 불가 합니다");
//			} else
////			다르면 true -> 다르면 입력한 비밀번호를 db에 해당유저의 비밀번호 수정
////			기존 유저데이터를 생성한 변수에 넣어줌
//				change = user;
////			setter이용해 값을 수정하는데 인코딩을 해줘야함
//			change.setPassword(encoding(password));
////			DB에 데이터 수정! .set을 이용하고 리스트에 변경된 유저를 준다
////				생성한 변수를 기존값에 덮어씌운다
//			users.set(users.indexOf(change), change);
//		} catch (NullPointerException e) {
//			System.out.println("현재 비밀번호와 다른 비밀번호로 입력하세요.");
//		} catch (Exception e) {
//			e.getMessage();
//		}
//	}

//	비밀번호 변경(비밀번호 변경 30일)
	public void changePassword30Days(String newPassword) {
//	조건 1. 로그인이 된 바로 직후
		User userInDb = checkId(userId);
//	로그인 후 db에 저장된 해당 유저의 비밀번호가 저장된 지 30일이 지났다면 
//	"비밀번호가 변경 된 지 30일이 지났습니다!\n변경 하시겠습니까??" 출력
//	이후 비밀번호 변경(마이페이지)의 메서드 사용
		if(userInDb != null) {
			userInDb.setPassword(encoding(newPassword));
		}
	}

//	인증번호 생성
	public String randomNumber() {
		String code = "";
		for (int i = 0; i < 6; i++) {
			code += (int) (Math.random() * 10);
			this.code = code;
		}
		return code;
	}

//	인증번호 전송
	public void sendEmail(String toMemberEmail) {
		final String bodyEncoding = "UTF-8"; // 콘텐츠 인코딩

		// 원하는 메일 제목 작성
		String subject = "메일 전송 테스트";

		// 보낸 이메일 작성
		String fromEmail = "jhing9075@gmail.com";
		String fromUsername = "승훈";

		String toEmail = toMemberEmail; // 콤마(,)로 여러개 나열

		// 도메인 사용할 필요 없다
		// 앱비밀번호
		final String username = "jhing9075@gmail.com";
		final String password = "uqwe ymbs vxld wokm";

		this.randomNumber();

		// 메일에 출력할 텍스트
		String html = null;
		StringBuffer sb = new StringBuffer();
		sb.append("<h3>인증번호 발송</h3>\n");
		sb.append("<h4>[인증번호6자리]</h4>");
		sb.append("<h4>" + code + "</h4>");
		sb.append("<h4>테스트 발송!</h4>");
		html = sb.toString();

		// 메일 옵션 설정
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");

		try {
			// 메일 서버 인증 계정 설정
			Authenticator auth = new Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			};

			// 메일 세션 생성
			Session session = Session.getDefaultInstance(props, auth);

			// 메일 송/수신 옵션 설정
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail, fromUsername));
			message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
			message.setSubject(subject);
			message.setSentDate(new Date());

//          // 메일 콘텐츠 설정
			Multipart mParts = new MimeMultipart();
			MimeBodyPart mTextPart = new MimeBodyPart();
			MimeBodyPart mFilePart = null;
			//
//          // 메일 콘텐츠 - 내용
			mTextPart.setText(html, bodyEncoding, "html");
			mParts.addBodyPart(mTextPart);
//                
//          // 메일 콘텐츠 설정
			message.setContent(mParts);

			// 메일 발송
			Transport.send(message);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	인증번호 확인
//	사용자의 입력값과 this.code가 같은지 검사
	public boolean checkCode(String inputCode) {
		return this.code.equals(inputCode);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputCode = null, message = "인증번호를 입력하세요";
		int errorCount = 0;
		User user = new User("1", "전승훈", "123456", "01012345678");
		
		UserField userField = new UserField();
		userField.join(user);
		System.out.println(DBconnecter.users);
		System.out.println(userField.checkId("1"));
		System.out.println(userField.login(user));
		userField.update(user);
		userField.changePassword30Days("123");

		System.out.println(userField.checkId("1"));
//		userField.sendEmail("jhing9075@gmail.com");
//		System.out.println(code);
//      이메일 인증번호 확인

//		do {
//			if (errorCount == 0) {
//				System.out.println(message);
//				inputCode = sc.nextLine().trim();
//			}else if(errorCount > 0 && errorCount < 3) {
//				System.out.println("다시입력하세요");
//				inputCode = sc.nextLine().trim();
//			}else if(errorCount > 3){
//				System.out.println("처음부터 다시 입력하세요");
//				break;
//			}
//			errorCount++;
//		} while (!userField.checkCode(inputCode));
//		
//		if(userField.checkCode(inputCode)) {
//			System.out.println("인증이 완료되었습니다.");
//		}else {
//			System.out.println("인증 실패");
//		}
	}
}
