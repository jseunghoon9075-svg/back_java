package classPractice;

class Market3 {
//   1. 상품명, 상품가격, 상품재고
	String productName;
	int productPrice;
	int productStock;

//	기본 생성자
	public Market() {;}
//	초기화 생성자
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}

	void sell(Customer customer, int count) {
		if(productStock < count) {
			System.out.println("재고가 없습니~다");
			 return;
		}
		String userName = customer.getUserName();
		int userMoney = customer.getUserMoney();
		double userDiscount = customer.getUserDiscount();
		int discountCost = (int)(productPrice - (userMoney * userDiscount));
		int totalCount = discountCost * count;
		
		if(totalCount > customer.getUserMoney()) {
			System.out.println("금액이 부족합니다!");
		}
		
	}
//   판매(sell)
//   힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
}

class Customer3 {
//   2. 이름, 폰, 돈, 할인율
	String userName;
	String lastPhoneNumber;
	int money;
	double discount;
//	기본 생성자
	public Customer() {;}
//	초기화 생성자
	public Customer(String userName, String lastPhoneNumber, int money, double discount) {
	this.userName = userName;
	this.lastPhoneNumber = lastPhoneNumber;
	this.money = money;
	this.discount = discount;
}
	String getUserName() {
		return userName;
	}
	int getUserMoney() {
		return money;
	}
	double getUserDiscount() {
		return discount;
	}
	
	
}
//      3. 마켓, 소비자를 객체화 시키고,
//      소비자에게 마켓의 물건을 판매
//      마켓의 상품 재고와, 소비자의 남은 금액을 출력

public class Practice7 {
	public static void main(String[] args) {
		Market product1 = new Market("치킨", 15_000, 20);
		Customer user1 = new Customer("홍길동", "1234", 150_000, 0.9);
		Customer user2 = new Customer("고길동", "5678", 50_000, 0.8);
		
		product1.sell(user1, 10);
	}
}
