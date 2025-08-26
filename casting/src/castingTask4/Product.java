package castingTask4;

//Product 상품
//- 필드: 이름, 가격, 재고
//
public class Product{
	private String product;
	private int price;
	private int stock;
	private double coupon;

	public Product() {
		;
	}


	public Product(String product, int price, int stock, double coupon) {
		this.product = product;
		this.price = price;
		this.stock = stock;
		this.coupon = coupon;
	}


	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
//	판매
	void sell(User user, String product, int count) {
		int productPrice = getPrice();
		int nonMemberPrice = (int)(productPrice * 0.95);
		int memberPrice = (int)(productPrice * 0.9);
		int nonMemberTotalPrice = (int)((stock*productPrice) * 0.95);
		int memberTotalPrice = (int)((stock*productPrice) * 0.9);
		
		if(!product.equals(this.product)) {
			System.out.println("등록된 상품을 입력해주세요");
			return; 
		}
		if(memberTotalPrice > user.money * count) {
			System.out.println(user.name +"님의 잔액이 부족합니다");
		}
		
		
	}
//	등록
	void register(Market[] product) {
		for(Market[] products : product) {
			
		}
	}
//	포인트적립
	void pointEarn() {
	}


}
