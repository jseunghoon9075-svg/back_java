package maker;

public class MarkerTest {
//	어떤 동물이 어떤 분류인지 알려주는 메서드
	public static void checkKinds(Animals[] animals) {
		for(int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof HerviboreMarker) {
				System.out.println("초식동물");
			}
			if(animals[i] instanceof CarnivoreMarker) {
				System.out.println("육식동물");
			}else
				System.out.println("잡식동물");
		}
	}
	
//	메서드 완성 후 각 동물들을 객체화 시킨 후 메서드 확인 출력!
	public static void main(String[] args) {
		
	}
}
