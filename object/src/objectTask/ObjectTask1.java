package objectTask;

import java.util.Objects;

// 상품 클래스를 만들고,
// toString, hashCode, Equals를 재정의하고
// 같은 상품인지 비교하기
// 1번 상품 
// 이름: 파인애플
// 가격: 20000
// 재고: 15
// 원산지(mou): 필리핀
public class ObjectTask1 {
	public ObjectTask1() {;}
	
	

	public static void main(String[] args) {
		Product prdTask = new Product();
		
		Product prd1 = new Product(1, "파인애플", 20_000, 15, "필리핀");
		Product prd2 = new Product(1, "수박", 15_000, 10, "중국");
		Product prd3 = new Product(3, "파인애플", 20_000, 15, "필리핀");
		
		System.out.println(prd1.equals(prd2));
		
		 
		
	}

}
