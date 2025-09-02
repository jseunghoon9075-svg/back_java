package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask3 {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();

		products.add(new Product(1L, "컴퓨터", 800_000, 25));
		products.add(new Product(2L, "마우스", 60_000, 105));
		products.add(new Product(3L, "키보드", 250_000, 5));
		products.add(new Product(4L, "헤드셋", 550_000, 305));
		products.add(new Product(5L, "스피커", 150_000, 2));

//		재고가 100개 이상인 상품만 출력
//		for (int i = 0; i < products.size(); i++) {
//			if (products.get(i).getStock() >= 100) {
//				System.out.println(products.get(i));
//			}
//		}
		
//		값을 수정할 때에는 수정할 값을 옮겨놓고 옮긴 객체에 setter를 이용해 값을 변경 후 set메서드를 사용해서 객체 자체를 바꿔준다
//		2. 마우스 가격 변경 100_000원으로 변경
//		for(Product product: products) {
//			if(product.getId() == 2L) {
//				product.setPrice(100_000);;
//			}
//		}
//		System.out.println(products);
//		
//		상품 재고가 100개 이하인 상품을 삭제
		
//		상품이 있는지 없는지 있다면 재고가 100개 이하인지 검사 후 삭제
//		for(Product removeProduct: products) {
//			
//		}
//		Product removeProduct = products.get(0);
//		for(int i = 0; i < products.size(); i++) {
//			System.out.println(products.get(i));
//			if(removeProduct.getStock() <= 100 && removeProduct.getStock() > 0) {
//				products.remove(removeProduct);
//			}
//		}
//		System.out.print(products);
//		for(Product product: products) {
//			product = products.get(products.indexOf(product));
//			if(product.getName().equals("마우스")) {
//				products.remove(product);
//			}
//		}
//		상품 이름이 마우스인 상품 삭제
		for(int i = 0; i < products.size(); i++) {
			Product removeMouse = products.get(i);
			if(removeMouse.getName().equals("마우스")) {
				products.remove(removeMouse);
			}
			System.out.println("마우스 삭제한 리스트:"+products);
		}
//		sequence.일정한 순서로 배열된 것
		
		
		
		
		
	}
}
