package castingPractice;


//Product 상품
//- 필드: 이름, 가격, 재고
//
public class Product{
	private String product;
	private int price;
	private int stock;
	private int coupon;
	private Product[] arr;

	public Product() {
		;
	}


	public Product(String product, int price, int stock, int coupon) {
		this.product = product;
		this.price = price;
		this.stock = stock;
		this.coupon = coupon;
	}

	public Product(String product, int price, int stock, int coupon, Product[] arr) {
		super();
		this.product = product;
		this.price = price;
		this.stock = stock;
		this.coupon = coupon;
		this.arr = arr;
	}


	public int getCoupon() {
		return coupon;
	}


	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}


	public Product[] getArr() {
		return arr;
	}


	public void setArr(Product[] arr) {
		this.arr = arr;
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

void register() {
//	setArr(product);
//	Product[] productArr = new Product[5];
//	
//	productArr[0] = new Product("아메리카노", 2000, 3, 1);
//	productArr[1] = new Product("카페라테", 5500, 4, 1);
//	productArr[2] = new Product("카페모카", 5500, 7, 1);
//	productArr[3] = new Product("아이스티", 5000, 5, 1);
//	productArr[4] = new Product("홍차", 4000, 10, 1);
//	
//	for(int i = 0; i < productArr.length; i++) {
//		System.out.println(productArr[i].product); 
//	}
}
//	포인트적립


}
