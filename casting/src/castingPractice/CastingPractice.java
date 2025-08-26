package castingPractice;

public class CastingPractice {


//- 캐스팅 심화
	//결과 확인
//		마켓 클래스
//		유저 클래스에 자식으로 맴버와 논맴버
	// 
		public static void main(String[] args) {
//			부모클래스 유저에 자식클래스 마켓맴버를 업캐스팅
			User mb1 = new MarketMember("홍길동","010-1234-5678", 20_000, 2_000);
			User mb2 = new MarketNonMember("김길동","010-1212-3434", 110_000, 5_000);
			Market market = new Market();
			Product product = new Product();
			Product[] productArr = {
					new Product("아메리카노", 2000, 3, 1),
					new Product("카페라테", 5500, 4, 1),
					new Product("카페모카", 5500, 7, 1),
					new Product("아이스티", 5000, 5, 1),
					new Product("홍차", 4000, 10, 1),
					};
			market.register(productArr);
		}
	}
