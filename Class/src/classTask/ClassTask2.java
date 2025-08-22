package classTask;

import java.util.Scanner;

class Market {
//	상품명, 상품가격, 상품재고
	String prd;
	int price;
	int count;
	
	public Market() {;}

	public Market(String prd, int price, int count) {
		this.prd = prd;
		this.price = price;
		this.count = count;
	}
	
	void sellProduct(Customer sale) {
	}
//	판매(sell)
//	힌트: 판매를 할 때 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
}
class Customer{
//	이름, 폰, 돈, 할인율
	String name;
	String phone;
	int money;
	double sale;
	
	public Customer() {;}

	public Customer(String name, String phone, int money) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.sale = 0.05;
	}
	
	
}
public class ClassTask2 {
	public static void main(String[] args) {
		Market mart = new Market("치킨", 15_000, 5);
		Customer user = new Customer("존슨", "010-1234-5678", 100_000);
		int count = 0, money = 0;
		String choice = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 상품을 입력하세요");
		
		choice = sc.next();
		
		
//		마켓, 소비자를 객체화 시키고,
//		소비자에게 마켓의 물건을 판매
//		마켓의 상품 재고와, 소비자의 남은 금액을 출력
	}
}
