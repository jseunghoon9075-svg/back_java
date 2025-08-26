package castingPractice;


//MarketNonMember

//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//
//- 마트 비회원과, 마트 회원을 객체화 시켜 물품을 구매하시오.

public class MarketNonMember extends User {
	public MarketNonMember() {;}

	public MarketNonMember(String name, String phone, int money, int point, int userDiscount) {
		super(name, phone, money, point, userDiscount);
	}
	
	
}
