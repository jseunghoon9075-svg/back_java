package view;

import java.util.Optional;

import dao.MemberDAO;
import vo.MemberVO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		memberVO.setMemberEmail("hgd1234");
		memberVO.setMemberPassword("1234");
	
//		if(memberDAO.checkId(memberVO.getMemberEmail())) {
//			System.out.println("사용가능 아이디");
//			memberDAO.join(memberVO);
//		} else {
//			System.out.println("중복된 아이디");
//		}
		
		if(memberDAO.login(memberVO)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
//		Optional<MemberVO> foundMember = memberDAO.findById();
//		foundMember.ifPresent(System.out::println);
//		MemberVO member = foundMember.orElseThrow();		
	}
}
