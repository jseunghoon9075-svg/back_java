package castingPractice;


//MarketMember 
//- 필드: 이름, 전화번호, 돈, 포인트, 쿠폰
//
public class MarketMember extends User{
	int memberDiscount;
	public MarketMember() {;}

	public MarketMember(String name, String phone, int money, int point,int memberDiscount) {
		super(name, phone, money, point, memberDiscount);
	}


}
