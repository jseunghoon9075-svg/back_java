package castingPractice;

//Market
//- 필드: 이름
//- 메서드:

//2. 상품 등록
//- 상품 등록은 최대 5개까지만 할 수 있다.
//(즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//- 마트에 같은 이름의 상품은 등록할 수 없다.
//


//4. 만약 비회원이라면 
//쿠폰 1장 제공, 쿠폰이 10장이라면 상품 무료!
public class Market{
	String name;
	int memberDiscount;
	int userDiscount;

	public Market() {;}

	
	public Market(String name, int memberDiscount, int userDiscount) {
		this.name = name;
		this.memberDiscount = memberDiscount;
		this.userDiscount = userDiscount;
	}

	//1. 상품 판매
	//- 등록된 상품만 판매할 수 있다. o
	//- 유저가 가진 돈보다 적으면 판매할 수 없다. o
	//- 유저가 마다의 할인율이 적용된다. o
	//   1. 비회원 할인율 5% 적용 o
	//   2. 멤버 할인율 30% 적용 o
	//- 등록된 상품의 재고보다 작으면 판매할 수 없다. o
	void sell(Product[] arr,User user,MarketMember member,String product, int count) {
		boolean flag = false;
		
		for(int i = 0; i < arr.length; i++) {
			int price = arr[i].getPrice() * count;
			int discount = price * user.discount / 100;
			int totalPrice = price - discount;
			int reward = totalPrice * user.discount / 100;
			
			if(arr[i].getProduct().equals(product)) {
				flag = true;
				if(arr[i].getStock() < count) {
					System.out.println("상품의 갯수가 부족합니다!!");
					return;
				}
				if(user.money < price) {
					System.out.println("금액이 부족합니다!");
					return;
				}
				
				System.out.println("주문:"+product +" "+count+"잔"+ "\n" + "가격:"
						+price+"원"+"/할인율:"+user.discount+"%\n총액:"+totalPrice+"원");
				System.out.println("잔액:" + (user.money - totalPrice) + "원");
				System.out.println(user.name+"님 "+reward+"원 적립되었습니다.");
				return;
			}
			
		}
	}
//	등록
	void register(Product[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(!(arr.length < 6)) {
				System.out.println("상품은 5개까지만 등록 가능합니다!");
				return;
			}
			System.out.println("상품이 등록되었습니다");
			System.out.printf("상품:%s\n가격:%d\n수량:%d\n쿠폰지급:%d\n",
					arr[i].getProduct(),arr[i].getPrice(),arr[i].getStock(),arr[i].getCoupon());
			
		}
	}
//	//3. 포인트 적립 메서드
	//- 비회원은 5%
	//- 회원은 10%
	void pointEarn(User user) {
		
	}

}
