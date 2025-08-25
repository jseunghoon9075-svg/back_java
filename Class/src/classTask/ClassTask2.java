package classTask;

import java.util.Scanner;

class Product2 {
	String[] prd;

	public Product2() {
		;
	}

	public Product2(String[] prd) {
		this.prd = prd;
	}

}

class Market2 {
//	상품명, 상품가격, 상품재고
	String prd;
	int price;
	int count;

	public Market2() {
		;
	}

	public Market2(String prds, int prices, int count) {
		this.prd = prds;
		this.price = prices;
		this.count = count;
	}
	
	int getPrice() {
		return price;
	}
	
	String getPrd() {
		return prd;
	}
	
	int getCount() {
		return count;
	}

	void sellProduct(Customer2 sale, Customer2 name) {
	}
//	판매(sell)
//	힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
	
	void marketService(String prd, int price, int count) {
		System.out.println(prd +":" + price + "원, 남은 갯수 : "+ count);
	}
	
	void saleUser1(Customer2 user1, int price, int buyCount, String[] prds, int[] stock) {
		
		if(count > buyCount) {
			System.out.println("재고가 없습니다!");
		}else if(count < buyCount) {
			System.out.println(user1.getName() + "님의 할인율" + user1.getSale()+"%");
			System.out.println(user1.getName() + "님의 남은 잔액은 :" + 
					(user1.getMoney() - (price * (user1.getSale() * 0.04))) + "원 입니다");
		} else;
		for(int i = 0; i < prds.length; i++) {
			System.out.println("남은"+ prds[i] +"의 갯수는 : "+ (stock[i] - buyCount));
		}
		
			
	}
	
}

class Customer2 {
//	이름, 폰, 돈, 할인율
	String name;
	int userNumber;
	int money;
	double sale;

	public Customer2() {
		;
	}

	public Customer2(String name, int userNumber, int money) {
		this.name = name;
		this.userNumber = userNumber;
		this.money = money;
	}
	public Customer2(String name, int userNumber, int money, double sale) {
		this.name = name;
		this.userNumber = userNumber;
		this.money = money;
		this.sale = sale;
	}

//	void setName(String name) {
//		this.name = name;
//	}
	
	String getName() {
		return name;
	}
	
	int getMoney() {
		return money;
	}
	
	double getSale() {
		return sale;
	}


}

public class ClassTask2 {
	public static void main(String[] args) {
		int money = 0, buyCount = 0, userNumber =0;
		int[] prices = {15_000, 25_000, 45_000}, stock = {3, 5, 1};
		String[] prds = { "치킨", "피자", "삼겹살" };
		

		String sellName = null;

		Market2 market = new Market2();
		Market2 chicken = new Market2(prds[0], prices[0], stock[0]);
		Market2 pizza = new Market2(prds[1], prices[1], stock[1]);
		Market2 meet = new Market2(prds[2], prices[2], stock[2]);

		Customer2 user1 = new Customer2("홍길동", 1, 200_000, 20);
		Customer2 user2 = new Customer2("김길동", 2, 50_000, 10);
		Customer2 user3 = new Customer2();

		Scanner sc = new Scanner(System.in);

		market.marketService(chicken.prd, chicken.price, chicken.count);
		market.marketService(pizza.prd, pizza.price, pizza.count);
		market.marketService(meet.prd, meet.price, meet.count);
		System.out.println("구매할 상품을 입력하세요");
		sellName = sc.nextLine();

		System.out.println("구매할 갯수를 입력하세요");
		buyCount = sc.nextInt();

		
//		유저 이름를 받고 유저들의 이름를 비교해 일치하면 해당유저의 이름과 할인율, 인삿말 출력
		
		
		Market2 market2 = new Market2();
		market2.saleUser1(user1, prices[0], buyCount, prds, stock);

//		마켓, 소비자를 객체화 시키고,
//		소비자에게 마켓의 물건을 판매
//		마켓의 상품 재고와, 소비자의 남은 금액을 출력
	}
}
