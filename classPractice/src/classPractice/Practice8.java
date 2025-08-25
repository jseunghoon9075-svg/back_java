package classPractice;

class Market {
	String productName;
	int productPrice;
	int productStock;

//	기본 생성자
	public Market() {
		;
	}

//	초기화 생성자
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}

	void sell(Customer customer, int count) {
		String userName = customer.userName;
		int userMoney = customer.money;
		double userDiscount = customer.getUserDiscount();
		int discountCost = (int) (productPrice - (userMoney * userDiscount));
		int totalCount = discountCost * count;
		
		if (productStock < count) {
			System.out.println("재고가 없습니~다");
		}

		if (totalCount > customer.getUserMoney()) {
			System.out.println("금액이 부족합니다!");
		} 
		
		if (totalCount > customer.getUserMoney()) {
			System.out.println(totalCount - customer.getUserMoney()+"원 ");
		}
	}
}

	class Customer {
//  2. 이름, 폰, 돈, 할인율
		String userName;
		String lastPhoneNumber;
		int money;
		double discount;

//	기본 생성자
		public Customer() {
			;
		}

//	초기화 생성자
		public Customer(String userName, String lastPhoneNumber, int money, double discount) {
			this.userName = userName;
			this.lastPhoneNumber = lastPhoneNumber;
			this.money = money;
			this.discount = discount;
		}



	}
//     3. 마켓, 소비자를 객체화 시키고,
//     소비자에게 마켓의 물건을 판매
//     마켓의 상품 재고와, 소비자의 남은 금액을 출력


public class Practice8 {
	public static void main(String[] args) {
		Market product = new Market("치킨", 15_000, 20);
		Customer user1 = new Customer("홍길동", "1234", 150_000, 0.9);
		Customer user2 = new Customer("고길동", "5678", 50_000, 0.8);

		product.sell(user1, 5);
	}
}
